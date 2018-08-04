package week1.day2.homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		Thread.sleep(5000);
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click on Leads Link
		driver.findElementByXPath("//a[starts-with(text(),'Leads')]").click();
		
		//Click on FindLeads Link
		driver.findElementByXPath("//a[starts-with(text(),'Find Leads')]").click();
		Thread.sleep(5000);
		//Enter first Name
		driver.findElementByXPath("(//label[starts-with(text(),'Last name:')]/parent::div/preceding::input[1])[3]").sendKeys("Gobi");
		
		//Find Leads button
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		//Click on First Link
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();
		
		//Verify the title of the page
		
		String Title=driver.getTitle();
		String ActualTitle="View Lead | opentaps CRM";
		if(Title.equals(ActualTitle))
		{
			System.out.println("Title verified successfully - Matching");
		}
		
		//click Edit
		driver.findElementByXPath("//div[@class='frameSectionExtra']/a[3]").click();
		Thread.sleep(2000);
		//change company name
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Zoho");
		
		//Click on update button
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		//validation of company name
		String updatedCompanyName=driver.findElementById("viewLead_companyName_sp").getText();
		String updateName="Zoho";		
		
		if(updatedCompanyName.contains(updateName))
		{
			System.out.println("Company Name Updation done successfully");
		}
		
		driver.close();
	}

}
