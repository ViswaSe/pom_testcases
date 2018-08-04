package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnDrop {

	public static void main(String[] args) {
		
		String url="https://jqueryui.com/draggable/";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement frame1=driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(frame1);
		
		WebElement source=driver.findElementById("draggable");
		
		Point dd=source.getLocation(); //Point is the class which helps to identify the webelement location
		
		int sourceX=dd.getX();
		int sourceY=dd.getY();
	
		int x=sourceX+100;
		int y=sourceY+100;
		
		Actions builder=new Actions(driver); //Actions is the class used for keyboard and mouse operations
		
		builder.dragAndDropBy(source, x, y).perform();
		
	}

}
