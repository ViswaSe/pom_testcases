package seleniumhomeworks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractise {

	public static ChromeDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		String url="https://www.hongkiat.com/blog/websites-creative-mouse-over-effects/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		Actions action=new Actions(driver);
		
		WebElement first=driver.findElementByClassName("menu-list__link");
		action.moveToElement(first).perform();
		
		Thread.sleep(5000);
		
		WebElement firstArticle=driver.findElementByXPath("//div[@class='entry-list']/div[1]/article[1]/a[1]");
		Thread.sleep(2000);
		
		action.click(firstArticle).perform();
		
		takeSS();
	}
	
	public static void takeSS() throws IOException
	{
		File src=driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("./snaps/mouseHover.png");
		FileUtils.copyFile(src, desc);
	}

}
