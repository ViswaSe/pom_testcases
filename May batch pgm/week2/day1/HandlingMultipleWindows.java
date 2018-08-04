package week2.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//click on contact us
		driver.findElementByLinkText("Contact Us").click();
		//get all window handles
		Set<String> allWindows=driver.getWindowHandles();
		//print how many windows are available
		System.out.println("Total Available windows: " +allWindows.size());
		
		//Switch set to List
		List<String> lstWindows=new ArrayList<String>();
		lstWindows.addAll(allWindows);
		String secWindow=lstWindows.get(1);
		//Switch to second window
		driver.switchTo().window(secWindow);
		driver.manage().window().maximize();
		System.out.println("The current Window URL is "+driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.quit();
	}

}
