package seleniumhomeworks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractise1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String url="http://jqueryui.com/selectable/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		Actions action=new Actions(driver);
		
		driver.switchTo().frame(0);
		
		WebElement item1=driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item2=driver.findElementByXPath("//li[text()='Item 2']");
		WebElement item3=driver.findElementByXPath("//li[text()='Item 3']");
		WebElement item4=driver.findElementByXPath("//li[text()='Item 4']");
		
		action.keyDown(Keys.CONTROL).click(item1).click(item2)
		.click(item3).click(item4).keyUp(Keys.CONTROL).build().perform();
		
		System.out.println("Successful");
	
	}

}
