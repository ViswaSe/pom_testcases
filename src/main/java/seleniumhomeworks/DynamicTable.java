package seleniumhomeworks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String url="http://toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/";
		driver.get(url);

		driver.manage().window().maximize();
		
		WebElement table=driver.findElementByXPath("//th[text()='Automation Tool']/preceding::table[1]/following::table");
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		int row=rows.size();
		
		
		
		
	}

}
