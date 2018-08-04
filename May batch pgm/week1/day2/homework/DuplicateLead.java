package week1.day2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		
		//click on Email
		driver.findElementByXPath("//span[contains(text(),'Email')]").click();
		
		//Type the email id
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("vichucts@gmail.com");
	
		//Click the Find Leads link 
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(2000);
		
		//click the first resulting id
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();
		Thread.sleep(2000);
		
		//capture the name of firstResulting lead
		String LeadName=driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();

		//click the duplicate lead button
		driver.findElementByXPath("//div[@class='frameSectionExtra']/a[1]").click();
		
		//Get the duplicate lead page title
		String ExpectedTitle="Duplicate Lead";
		String ActualTitle=driver.findElementByXPath("//div[@class='x-panel-header sectionHeaderTitle']").getText();
		
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Title matches successfully");
		}
	
		//create a duplicate lead by click on create lead button
		driver.findElementByXPath("//input[@name='submitButton']").click();
		
		//Validate the duplicate lead name
		String DuplicateLeadName=driver.findElementById("viewLead_firstName_sp").getText();
		
		if(DuplicateLeadName.equals(LeadName))
		{
			System.out.println("Duplicate Lead name matching successfully");
		}
		
	}
	

}
