package week1.day2.homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mapsofindia.com/events/2018-holidays-calendar.html");
		//To print the webtable in the console
		WebElement table=driver.findElementByClassName("tableizer-table");
		List<WebElement> allDays=table.findElements(By.tagName("tr"));
		for(WebElement eachDay:allDays)
		{
			List<WebElement> eachCols=eachDay.findElements(By.tagName("td"));
			for(int i=0;i<eachCols.size();i++)
			{
				System.out.print(eachCols.get(i).getText()+" ");
			}
			System.out.println();
		}
		
	}

}
