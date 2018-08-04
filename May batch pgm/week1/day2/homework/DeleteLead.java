package week1.day2.homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize the screen
		driver.manage().window().maximize();
		//Login to url
		driver.get("http://leaftaps.com/opentaps");
		//Enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter password
		driver.findElementById("password").sendKeys("crmsfa");
		//Click on login button
		driver.findElementByClassName("decorativeSubmit").click();
		//click on the CRM/SFA link
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();
		
		//click on Leads link
		driver.findElementByXPath("//a[starts-with(text(),'Leads')]").click();
		//click on find leads link
		driver.findElementByXPath("//a[starts-with(text(),'Find Leads')]").click();
		//click on phone tab
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
		//enter phone number 
		driver.findElementByXPath("//input[@name='phoneCountryCode']").clear();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9578184957");
		
		driver.findElementByXPath("//button[starts-with(text(),'Find Leads')]").click();
		Thread.sleep(2000);
		//capture lead ID of first resulting lead
		
		String leadId=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").getText();
		System.out.println("Lead ID : "+leadId);
		
		//click on the first resulting Lead
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();
		
		//Click on Delete link
		driver.findElementByXPath("//div[@class='frameSectionExtra']/a[4]").click();
		
		//click on find leads link
		driver.findElementByXPath("//a[starts-with(text(),'Find Leads')]").click();
		Thread.sleep(3000);
		
		//Enter the captured lead id on Lead id field
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadId);
		driver.findElementByXPath("//button[starts-with(text(),'Find Leads')]").click();
		Thread.sleep(3000);
		String ExpectedError="No records to display";
		String ActualError=driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText();
	
		if(ExpectedError.equals(ActualError))
		{
			System.out.println("Error message matching successfully");
		}
	}

}
