package dailypractise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alerts_day1 {

	public static void main(String args[]) throws IOException
	{
		String url="http://demo.guru99.com/test/delete_customer.php";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElementByName("cusid").sendKeys("Vishveshwar");
		driver.findElementByName("submit").click();
		
		
		Alert obj=driver.switchTo().alert();
		obj.accept();
		
		Alert second=driver.switchTo().alert();
		String response=second.getText();
		System.out.println(response);
		second.accept();
		
		driver.navigate().forward();
		
		
	}
	
	public static void takeSnap(ChromeDriver driver) throws IOException
	{
		File src=new File("./snaps/newimg.png");
		File desc=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(desc, src);
	}
	
}
