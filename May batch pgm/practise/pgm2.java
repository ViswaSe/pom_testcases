package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		List<WebElement> fields=driver.findElementsByTagName("input");
		
		for(WebElement each:fields)
		{
			System.out.println(each.getAttribute("type")); // Get all the fields in this line
		}
		
	}

}
