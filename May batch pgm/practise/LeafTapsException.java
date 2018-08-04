package practise;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsException {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		String url="http://leaftaps.com/opentaps/control/main";
		
		driver.get(url);

		driver.manage().window().maximize();
		
		
		try 
		{
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			WebElement ele=driver.findElementByXPath("//img[@src='/opentaps_images/integratingweb/crm1.png']");
			ele.click();
			driver.quit();
		} 
		
		catch (NoSuchElementException e)
		{
			System.out.println("No Such Element exception occured"+e.getMessage());
			throw new RuntimeException();
		}
		
		catch (WebDriverException e) 
		{
			System.out.println("Exception occured : "+e.getMessage());
			throw new RuntimeException();
		}
		
		finally
		{
			System.out.println("Program ended");
		}
		
	}

}
