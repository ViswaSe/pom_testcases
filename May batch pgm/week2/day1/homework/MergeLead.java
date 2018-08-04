package week2.day1.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//implicitly waited for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//img[@src='/opentaps_images/integratingweb/crm.png']").click();
		driver.findElementByXPath("//a[starts-with(text(),'Leads')]").click();
		//Click on Merge lead 
		driver.findElementByXPath("//a[starts-with(text(),'Merge Leads')]").click();
		//Click on From lead icon
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		//Move to new window
		Set<String> allWindows=driver.getWindowHandles();
		List<String> lstWindows=new ArrayList<String>();
		lstWindows.addAll(allWindows);
		String firstWindow=lstWindows.get(0);
		String secWindow=lstWindows.get(1);
		driver.switchTo().window(secWindow);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		//Enter lead ID
		driver.findElementByXPath("//input[@class=' x-form-text x-form-field']").sendKeys("10080");
		//Find Leads button
		driver.findElementByXPath("//td[@class='x-btn-center']").click();
		Thread.sleep(2000);
		//Click on the first resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1])[1]").click();
		//Switch back to Primary Window
		driver.switchTo().window(firstWindow);
		//Click on To lead icon
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
	
		
		//Move to new window
		Set<String> allWindows1=driver.getWindowHandles();
		List<String> lstWindows1=new ArrayList<String>();
		lstWindows1.addAll(allWindows1);
		String firstWindow1=lstWindows1.get(0);
		String secWindow1=lstWindows1.get(1);
		driver.switchTo().window(secWindow1);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		//Enter lead ID
		driver.findElementByXPath("//input[@class=' x-form-text x-form-field']").sendKeys("10081");		
		//Find Leads button
		driver.findElementByClassName("x-panel-btn-td").click();
		Thread.sleep(2000);
		//Click on the first Resulting lead
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();
		//Switch back to Primary Window
		driver.switchTo().window(firstWindow);
		
		//Click on Merge Button
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		
		//Handling Alert
		Alert aler=driver.switchTo().alert();
		System.out.println(aler.getText());
		aler.accept();
		
		//Click on Find leads button
		driver.findElementByXPath("//a[starts-with(text(),'Find Leads')]").click();
		//Enter From lead Id
		driver.findElementByXPath("//input[@name='id']").sendKeys("1000");
		//Click on Find leads button
		driver.findElementByXPath("//button[starts-with(text(),'Find Leads')]").click();
		//Verify the text
		Thread.sleep(2000);
		String actualText=driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		String Expected="No records to display";
		
		if(actualText.contains(Expected))
		{
			System.out.println("Error message matching Successfully "+actualText);
		}
		
		driver.quit();
	}

}
