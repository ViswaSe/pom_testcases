package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps");
		
		//To find the x-path - attribute xpath:
		
		driver.findElementByXPath("createLeadForm_companyName").sendKeys("Cognizant");
		
		
	}

}
