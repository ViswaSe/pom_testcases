package seleniumhomeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBirthWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String url="http://leaftaps.com/crmsfa/control/createContactForm";
		driver.get(url);
		
		Thread.sleep(10000);
		
/*		driver.findElementById("createContactForm_birthDate-button").click();
		
		WebElement table=driver.findElementByXPath("//div[@class='calendar']/table[1]");

		List<WebElement> allRows=table.findElements(By.className("daysrow"));
		WebElement selectedRow=allRows.get(2);
		
		List<WebElement> allCols=selectedRow.findElements(By.tagName("td"));
		WebElement firstCol=allCols.get(0);
	
		firstCol.click();*/

		driver.findElementByXPath("//img[@alt='Lookup']").click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		List<String> list=new ArrayList<String>(allWindows);
		String myWindow=list.get(1);
		
		driver.switchTo().window(myWindow);
		
		String myWindowurl=driver.getCurrentUrl();
		System.out.println(myWindowurl);
		
		//child window,alert - screenshot dont take.
	
	}
	

}
