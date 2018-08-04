package seleniumhomeworks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions3 {
	
	public static void main(String args[])
	{
		String url="https://www.facebook.com/";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement email=driver.findElementById("email");
		email.sendKeys("harish1234@gmail.com");
		
		Actions builder=new Actions(driver);
		
		builder.doubleClick(email).perform();
		
		builder.keyDown(Keys.CONTROL).sendKeys(email,"C").keyUp(Keys.CONTROL).perform();
		
	}

}
