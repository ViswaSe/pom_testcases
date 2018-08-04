package codingchallenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String url="http://leafground.com/pages/checkbox.html";
		
		driver.manage().window().maximize();
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String text=driver.findElementByXPath("//input[@type='checkbox']").getText();
		
		System.out.println(text);
		
		/*int val=0;
		
		for(int i=1;i<=14;i++)
		{
			val++;
			WebElement ob=driver.findElementByXPath("//div[@class='example']/input[i]");
			String text=ob.getText();
			boolean result=ob.isSelected();
			
			if(result)
			{
				System.out.println("The checkbox "+text+" is selected");
			}
			
			else
			{
				System.out.println("The checkbox "+text+" is not selected");
			}
		}
*/
	}

}
