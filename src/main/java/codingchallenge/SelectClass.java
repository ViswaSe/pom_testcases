package codingchallenge;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	/*How to select country dropdown value from IRCTC website 
	that starts with E but the second match (select Egypt not Ecuador)?
	*/
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url="https://www.irctc.co.in/nget/user-registration";
		driver.get(url);
	
		Thread.sleep(10000);
		
		WebElement country=driver.findElementByXPath("//select[contains(@class,'form-control')]");

		Select ob=new Select(country);
		List<WebElement> list=ob.getOptions();
		List<String> resultSet=new ArrayList();
		for(WebElement each:list)
		{
			String text=each.getText();
			if(text.startsWith("E"))
			{
				resultSet.add(text);
			}
		}
	
		ob.selectByVisibleText(resultSet.get(1));
	}

}
