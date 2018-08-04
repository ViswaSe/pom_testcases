package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveToEle {

	public static void main(String[] args) throws InterruptedException {
		
		String url="https://www.flipkart.com/";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='✕']").click();
				
		WebElement electronics=driver.findElementByXPath("//Span[text()='Electronics']");
		WebElement OPPO=driver.findElementByXPath("//Span[text()='OPPO']");
		
		Actions builder=new Actions(driver);
		builder.moveToElement(electronics).perform();
		expWait(driver,OPPO);
		builder.click(OPPO).perform();
		
		System.out.println("Action successfully done");
		
		driver.close();
	}
	
	public static void expWait(WebDriver driver,WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

}
