package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Switch to frame
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[contains(text(),'Try it')]").click();
		
		//Handling Alert
		Alert myAlert=driver.switchTo().alert();
		myAlert.sendKeys("Vishveshwar");
		myAlert.accept();
		
		//TextValidation
		String actualResult=driver.findElementByXPath("//p[@id='demo']").getText();
		String Expected="Vishveshwar";
		
		if(actualResult.contains(Expected))
		{
			System.out.println("Name matching Successfully, " +actualResult);
		}
		
	}

}
