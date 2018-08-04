package dailycoding;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LastOptionDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByXPath("//img[@src='/opentaps_images/integratingweb/crm.png']").click();
		
		driver.findElementByXPath("//a[starts-with(text(),'Create Lead')]").click();
		
		WebElement sourceDD=driver.findElementById("createLeadForm_dataSourceId");
		List<WebElement> allOptions=sourceDD.findElements(By.tagName("option"));		
		Select ob=new Select(sourceDD);
		int size=allOptions.size();
		System.out.println("Total Drop down size: "+size);
		ob.selectByIndex(size-1);
	}

}
