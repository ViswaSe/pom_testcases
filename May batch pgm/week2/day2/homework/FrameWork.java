package week2.day2.homework;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameWork {
	
	public ChromeDriver driver;
	int i=1;
	
	public void invokeBrowser(String url)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize(); //To maximize the window
		driver.get(url); //To open the url
		takeSnap();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implicit wait
		System.out.println("The url "+url+" launched successfully");
	}
	
	public void takeSnap()
	{
		File src=driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("./FrameWorkSS/img"+i+".png");
		try 
		{
			FileUtils.copyFile(src, desc);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		i++;
	}
	
	public WebElement locateElement(String locator,String value)
	{
		switch(locator)
		{
			case "id":
				return driver.findElementById(value); 
			case "class":
				return driver.findElementByClassName(value);
			case "XPath":
				return driver.findElementByXPath(value);
			case "link":
				return driver.findElementByLinkText(value);
			case "name":
				return driver.findElementByName(value);
		}
		return null;
	}
	
	public void type(WebElement ele,String data)
	{
		ele.sendKeys(data);
		System.out.println("Value: "+data+" send to the browser successfully");
		takeSnap();
	}
	
	public void clickWithScreenshot(WebElement ele)
	{
		String text=ele.getText();
		ele.click();
		
		if(!(text.equals("")))
		{
			System.out.println(text +" : clicked successfully");
		}
		
		takeSnap();
	}
	
	
	public void explictWait(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public void selectDropDownByIndex(WebElement ele,int index)
	{
		Select obj=new Select(ele);
		List<WebElement> lst=obj.getOptions();
		String text=lst.get(index).getText();
		obj.selectByIndex(index);
		takeSnap();
		System.out.println(text+" option is selected in the drop down successfully");
	}
	
	public WebElement webTable(WebElement table,int rowIndex,int colIndex)
	{
		List<WebElement> allRows=table.findElements(By.tagName("tr"));
		WebElement selectedRow=allRows.get(rowIndex);
		List<WebElement> allCols=selectedRow.findElements(By.tagName("td"));
		WebElement selectedCol=allCols.get(colIndex);
		return selectedCol;
	}
	
}
