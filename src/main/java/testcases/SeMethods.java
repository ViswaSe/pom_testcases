package testcases;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import week2.day2.wdMethods.WdMethods;

public class SeMethods extends Reporter implements WdMethods{

	public static RemoteWebDriver driver;

	public int i=1;

	public static String leadName_findLeads;
	public static String leadId_findLeads;
	
	@Override
	public void startApp(String browser, String url) {

		try
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			reportStep("Browser started","pass");
		}

		catch(NoSuchSessionException e)
		{
			reportStep("No Such Session Exception : Browser not available","fail");
			throw new RuntimeException(); //To close the program 
		}

		catch (WebDriverException e) {
			reportStep("WebDriver Exception : Driver not available","fail");
			throw new RuntimeException();
		}

		finally
		{
			takeSnap();
		}
	}

	@Override
	public WebElement locateElement(String locator, String locValue) {

		try 
		{
			WebElement ele;
			switch(locator) {

			case "id":	
				ele=driver.findElementById(locValue);
				return ele;
			case "class":
				ele=driver.findElementByClassName(locValue);
				return ele;

			case "name":
				ele=driver.findElementByName(locValue);
				return ele;

			case "link":
				ele=driver.findElementByLinkText(locValue);
				return ele;
			}
		} 

		catch (NoSuchElementException e)
		{
			reportStep("No Such Element Exception :" +locValue+" WebElement not found","fail");
			throw new RuntimeException();
		}

		catch (WebDriverException e)
		{
			reportStep("Browser/driver not found Properly","fail");
			throw new RuntimeException();
		}

		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {

		WebElement ele = null;
		try 
		{
			ele=driver.findElementByXPath(locValue); //Xpath
		}
		catch(NoSuchElementException e) 
		{
			reportStep("NoSuchElementException :"+locValue+"WebElement not found","fail");
			throw new RuntimeException();
		}

		catch (WebDriverException e)
		{
			reportStep("Browser/driver not found Properly","fail");
			throw new RuntimeException();
		}
		return ele;
	}

	@Override
	public void type(WebElement ele, String data) {

		ele.sendKeys(data);
		takeSnap();

	}

	public void clear(WebElement ele) {

		ele.clear();
		takeSnap();

	}

	@Override
	public void click(WebElement ele) {

		ele.click();
		takeSnap();
	}

	@Override
	public String getText(WebElement ele) {

		String text=ele.getText();
		return text;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {

		try 
		{
			Select obj=new Select(ele);
			obj.selectByValue(value);
			reportStep("Value : "+ele+" selected in the drop down successfully","pass");
		} 
		catch (NoSuchElementException e) 
		{
			reportStep("NoSuchElementException :"+ele+"WebElement not found","fail");
			throw new RuntimeException();
		}
	}


	public void selectDropDownUsingVisibleText(WebElement ele, String text) {

		try 
		{
			Select obj=new Select(ele);
			obj.selectByVisibleText(text);
			reportStep("value : "+ele+" selected in the dropdown successfully","pass");
		}

		catch (NoSuchElementException e) 
		{
			reportStep("NoSuchElementException :"+ele+"WebElement not found","fail");
			throw new RuntimeException();
		}
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try 
		{
			Select obj=new Select(ele);
			List<WebElement> lst=obj.getOptions();
			WebElement temp=lst.get(index);
			String text=getText(temp);
			System.out.println(text);
			obj.selectByIndex(index);
			reportStep("Drop down value :"+text+" selected successfully","pass");
		} 
		catch(IndexOutOfBoundsException e) 
		{
			reportStep("Greater Index value :"+index+"in a WebElement"+ele,"fail");
			throw new RuntimeException(); //To stop the execution
		}
		catch(RuntimeException e)
		{
			reportStep("Incorrect index selected:"+index+"in a WebElement"+ele,"fail");
			throw new RuntimeException();
		}
		finally
		{
			takeSnap();
		}
	}

	@Override
	public boolean verifyTitle(String expectedTitle) {

		String actualTitle=driver.getTitle();
		System.out.println("Actual title is " +actualTitle);
		String expected=expectedTitle;

		if(actualTitle.equals(expected))
		{
			reportStep("Title matching Successfully "+expectedTitle,"pass");
			return true;
		}
		return false;
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {

		String actualText=getText(ele);
		if(actualText.equals(expectedText))
		{
			reportStep(actualText+" - Text matching successfully","pass");
		}
		else
		{
			reportStep(actualText+" - Text doesnt matching","fail");
		}
	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {

		String text=getText(ele);
		if(text.contains(expectedText))
		{
			reportStep(text+ " - Partially matching","pass");
		}

	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) 
	{
		try
		{
			boolean exactAttribute=ele.getAttribute(attribute).equals(value);
			if(exactAttribute)
			{
				reportStep("Attribute is exactly matching "+attribute,"pass");
			}
			else
			{
				reportStep("Attribute is not exactly matching "+attribute,"fail");
			}
		} 
		catch (WebDriverException e) 
		{
			throw new RuntimeException();
		}
	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) 
	{
		try {
			String text=ele.getAttribute(attribute);
			System.out.println(text);
			boolean partialAttribute=text.contains(value);
			if(partialAttribute)
			{
				reportStep("Attribute is partially matching "+attribute,"pass");
			}
			else
			{
				reportStep("Attribute is not partially matching "+attribute,"fail");
			}
		} 
		catch (WebDriverException e) 
		{
			reportStep("WebDriver Exception during attribute Vaildation " + attribute,"fail");
			throw new RuntimeException();
		}
	}


	@Override
	public void verifySelected(WebElement ele) {

		boolean checkBoxValidation=ele.isSelected();
		String text=getText(ele);
		if(checkBoxValidation)
		{
			reportStep(text+"is selected","pass");
		}
		else
		{
			reportStep(text+"is not selected","fail");
		}
	}

	@Override
	public void verifyDisplayed(WebElement ele) {

		String text=getText(ele);
		if (ele.isDisplayed()) {
			reportStep(text+" is displayed successfully","pass");

		}else
		{
			reportStep(text+" is not displayed as expected","fail");
		}

	}
	@Override
	public void switchToWindow(int index) {

		String currentWindow="";

		try
		{
			Set<String> allWindows=driver.getWindowHandles();
			List<String> lstWindows=new ArrayList<String>();
			lstWindows.addAll(allWindows);
			//	currentWindow=lstWindows.get(index)+"Viswa"; //For no such Window exception validation
			currentWindow=lstWindows.get(index);
			driver.switchTo().window(currentWindow);
			reportStep("Window navigation successfully done","pass");
		} 
		catch (IndexOutOfBoundsException e) 
		{
			reportStep("Trying to Navigate to Incorrect Window value","fail");
			throw new RuntimeException();
		}
		catch(NoSuchWindowException e)
		{
			reportStep("Trying to Navigate to Incorrect Window value","fail");
			throw new RuntimeException();
		}
	}

	@Override
	public void switchToFrame(WebElement ele) {

		driver.switchTo().frame(ele);
		takeSnap();
		reportStep("Navigate to the frame successfully","pass");
	}

	@Override
	public void acceptAlert() {

		Alert alert=driver.switchTo().alert();
		String text=getAlertText();
		System.out.println(text);
		alert.accept();
		reportStep("Alert accepted succeessfully","pass");
	}

	@Override
	public void dismissAlert() {

		Alert alert=driver.switchTo().alert();
		String text=getAlertText();
		System.out.println(text);
		alert.dismiss();
		reportStep("Alert dismissed succeessfully","pass");
	}

	@Override
	public String getAlertText() {

		String text=driver.switchTo().alert().getText();
		reportStep("Alert Text captured successfully","pass");
		return text;
	}

	@Override
	public void takeSnap() {

		File src=driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("./snaps/EditContactNewSnaps/img"+i+".png");
		try 
		{
			FileUtils.copyFile(src,desc);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		i++;
	}

	@Override
	public void closeBrowser() {

		driver.close();
	}



	public void expWait(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void selectWebTable(WebElement ele,int rowIndex,int colIndex,String rowTagName,String colTagName)
	{
		List<WebElement> allRows=ele.findElements(By.tagName(rowTagName));
		WebElement row=allRows.get(rowIndex);
		List<WebElement> allCols=row.findElements(By.tagName(colTagName));
		WebElement column=allCols.get(colIndex);
		column.click();
		takeSnap();
	}

	public void clickWithoutSS(WebElement ele) {		
		expWait(ele);
		ele.click();

	}

	@Override
	public void closeAllBrowsers() {

		driver.quit();
	}

}
