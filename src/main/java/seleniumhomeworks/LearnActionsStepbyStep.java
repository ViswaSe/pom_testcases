package seleniumhomeworks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionsStepbyStep {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//String url="http://jqueryui.com/draggable/";
		//String url="http://jqueryui.com/droppable";
		//String url="http://jqueryui.com/resizable/";
		//String url="http://jqueryui.com/selectable/";
		String url="http://jqueryui.com/sortable/";
		driver.get(url);
		
		Actions builder=new Actions(driver);
		
		WebElement fram=driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(fram);
		
		//WebElement draggable=driver.findElementById("draggable");
		//WebElement droppable=driver.findElementById("droppable");
		//builder.dragAndDropBy(draggable, 0,50).perform();
		//builder.dragAndDrop(draggable, droppable).perform();
		
		//WebElement resizeable=driver.findElementById("resizable");
		//builder.clickAndHold(resizeable).moveByOffset(100, 210).release(resizeable).perform();
	
		/*WebElement item1=driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item3=driver.findElementByXPath("//li[text()='Item 3']");
		WebElement item5=driver.findElementByXPath("//li[text()='Item 5']");
		//builder.clickAndHold(item1).release(item5).perform();
		//builder.click(item1).contextClick(item1).perform();
		*/
		
		WebElement item1=driver.findElementByXPath("//li[text()='Item 1']");
		builder.clickAndHold(item1).dragAndDropBy(item1,50,50).release(item1).perform();

	}

}
