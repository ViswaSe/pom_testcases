package seleniumhomeworks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[text() = 'Sortable']").click();
		WebElement frame = driver.findElementByXPath("//iframe[@class = 'demo-frame']");
		driver.switchTo().frame(frame);
		WebElement item1 = driver.findElementByXPath("//ul/li[text() = 'Item 1']");
		WebElement item5 = driver.findElementByXPath("//ul/li[text() = 'Item 5']");
		int y = item5.getLocation().getY();
		Actions builder1 = new Actions(driver);

		builder1.clickAndHold(item1).dragAndDropBy(item1, 0, y).perform();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		driver.findElementByXPath("//li/a[text() = 'Droppable']").click();
		WebElement insideFrame = driver.findElementByXPath("//iframe[@class = 'demo-frame']");
		driver.switchTo().frame(insideFrame);
		WebElement drag1 = driver.findElementByXPath("//div[@id = 'draggable']");

		WebElement drop1 = driver.findElementByXPath("//div[@id = 'droppable']");

		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag1, drop1).perform();
		driver.switchTo().defaultContent();

		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text() = '✕']").click();
		WebElement tv = driver.findElementByXPath("//span[text() ='TVs & Appliances']");
		WebElement tvBrand = driver.findElementByXPath("//span[text() ='Thomson']");
		Actions builder3 = new Actions(driver);
		builder3.moveToElement(tv).pause(3000).click(tvBrand).perform();

	}

}