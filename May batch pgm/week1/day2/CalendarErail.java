package week1.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarErail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		WebElement FromSt=driver.findElementById("txtStationFrom");
		FromSt.clear();
		FromSt.sendKeys("Mas",Keys.TAB);
		
		WebElement ToSt=driver.findElementById("txtStationTo");
		ToSt.clear();
		ToSt.sendKeys("cbe",Keys.TAB);
		
		boolean selected=driver.findElementById("chkSelectDateOnly").isSelected();
		
		if(!selected)
		{
			driver.findElementById("chkSelectDateOnly").click();
		}
		
		Thread.sleep(3000);
		WebElement table=driver.findElementByXPath("//*[@id='divTrainsList']/table[1]");
		List<WebElement> allRows=table.findElements(By.tagName("tr"));
		/*WebElement FirstRow=allRows.get(0);
		
		List<WebElement> allCols=FirstRow.findElements(By.tagName("td"));
		//WebElement secondCol=allCols.get(1);
		
		
		for(int i=0;i<allCols.size();i++)
		{
			System.out.print(allCols.get(i).getText()+ " ");
		} */
		
		for(WebElement eachWebEle:allRows)
		{
			List<WebElement> allCol=eachWebEle.findElements(By.tagName("td"));
			System.out.println(allCol.get(1).getText());
		
		}
	}

}
