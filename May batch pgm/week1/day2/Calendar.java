package week1.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar {

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
		
		
		//Source drop down
		
		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
		Select sdd=new Select(source);
		sdd.selectByVisibleText("Existing Customer");
		
		//Marketing drop down
		
		WebElement marketing=driver.findElementById("createLeadForm_marketingCampaignId");
		Select mdd=new Select(marketing);
		mdd.selectByIndex(3);
		
		//Industry drop down
		
		WebElement industry=driver.findElementById("createLeadForm_dataSourceId");
		Select idd=new Select(industry);
		List<WebElement> allIndustryOptions=idd.getOptions();
		
		//WebTable
		driver.findElementById("createLeadForm_birthDate-button").click();
		Thread.sleep(4000);
		WebElement table=driver.findElementByXPath("//div[@class='calendar']/table");
		List<WebElement> allRows=table.findElements(By.tagName("tr"));
		//List<WebElement> allRows=driver.findElementsByClassName("daysrow");
		WebElement FourthRow=allRows.get(6);
		List<WebElement> allCols=FourthRow.findElements(By.tagName("td"));
		WebElement Secondcol=allCols.get(1);
		Secondcol.click();
		
		//submit 
		driver.findElementByClassName("smallSubmit").click();
		
		
	}

}
