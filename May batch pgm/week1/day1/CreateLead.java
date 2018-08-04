package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		//click on create lead link
		driver.findElementByLinkText("Create Lead").click();
		Thread.sleep(5000);
		//give lead company
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
		//give lead name
		driver.findElementById("createLeadForm_firstName").sendKeys("Gobi");
		//give lead last name
		driver.findElementById("createLeadForm_lastName").sendKeys("chand");
		//submit 
		driver.findElementByClassName("smallSubmit").click();
	}

}
