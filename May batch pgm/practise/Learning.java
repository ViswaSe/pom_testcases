/**
 * 
 */
package practise;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * @author Vichu
 *
 */
public class Learning {

	/**
	 * @param args
	 */
	
	public static ChromeDriver driver;
	static int i=0;
	
	@Test
	public static void learn() throws IOException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//String url="https://www.facebook.com/";
		//String url="http://leaftaps.com/opentaps";
		//String url="http://www.tnstc.in/TNSTCOnline/";
		//String url="http://www.tnstc.in/";
		//String url="https://developer.servicenow.com/app.do#!/home";
		String url="https://jqueryui.com/draggable/";
		driver.get(url);
		
	/*	//Lern Select - Birthday selection in facebook
		//Select by index
		WebElement birth_day=driver.findElementById("day");
		Select birthday=new Select(birth_day);
		birthday.selectByIndex(1);

		//select by value
		WebElement month=driver.findElementById("month");
		Select birthdayMonth=new Select(month);
		birthdayMonth.selectByValue("12");
	
		//select by visible text
		WebElement year=driver.findElementById("year");
		Select birthYear=new Select(year);
		birthYear.selectByVisibleText("1994");
		
		takeSnap();
		
		*/
		
			//Learn webtable
	/*	
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_birthDate-button").click();
		takeSnap();
		
		WebElement calendarTable=driver.findElementByXPath("//div[@class='calendar']/table[1]/tbody");
		
		List<WebElement> allRows=calendarTable.findElements(By.tagName("tr"));
		
		
		//For click the current date
		WebElement secRw=allRows.get(1);
	 	List<WebElement> allCols=secRw.findElements(By.tagName("td"));
		WebElement currentDate=allCols.get(3);	
		String text=currentDate.getText();
		System.out.println(text);
		currentDate.click();   
		
		for(int i=0;i<allRows.size();i++)
		{
			WebElement row=allRows.get(i);
			List<WebElement> allCols=row.findElements(By.tagName("td"));
			
			for(int j=0;j<allCols.size();j++)
			{
				WebElement col=allCols.get(j);
				System.out.print(col.getText()+" | ");
			}
			System.out.println();
		}  
		*/
		
	//	takeSnap();   
		
		
		//Learn Alert
		
/*		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//input[@id='ComboBox_partyIdFrom']").sendKeys("10057");
		driver.findElementByXPath("//input[@id='ComboBox_partyIdTo']").sendKeys("10060");
		driver.findElementByClassName("buttonDangerous").click();
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println("Alert triggered " +text );
		alert.accept(); */
		
		//Learn frame
/*		
		driver.findElementByName("txtUserLoginID").sendKeys("Vishveshwar_2015");
		driver.findElementByName("txtPassword").sendKeys("Setc_25");
		driver.findElementByClassName("dboxheader").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frame=driver.findElementByXPath("//iframe[@src='http://www.tnstc.in/eBooking/Html/afterLoginBox.html']");
		driver.switchTo().frame(frame);
		
		WebElement frameContent=driver.findElementByXPath("//span[@class='news_headerTxt']/..");
		
		System.out.println(frameContent.getText());
*/
		
		//Learn window
/*		
		driver.findElementByXPath("//img[@src='images/eTicket_button.jpg']").click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		for(String eachWindow:allWindows)
		{
			System.out.println(eachWindow);
		}
		
		List<String> allWindowslst=new ArrayList<String>();
		allWindowslst.addAll(allWindows);
		
		String reqWindow=allWindowslst.get(1);
		driver.switchTo().window(reqWindow);
		
		driver.findElementByName("txtUserLoginID").sendKeys("Vishveshwar_2015");
		driver.findElementByName("txtPassword").sendKeys("Setc_25");
		driver.findElementByClassName("dboxheader").click();
*/	
		
		//Learn Actions class

/* 1.Mouse hover		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Actions builder=new Actions(driver);
		WebElement learning=driver.findElementById("dp-hdr-br-learn-link");
		builder.moveToElement(learning).perform();
		driver.findElementById("dp-hdr-br-link-training").click();
		driver.close();
*/
		
// 2. Drag and drop 
		driver.findElementByLinkText("Droppable").click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		WebElement frame=driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(frame);
		Actions builder=new Actions(driver);
		WebElement dragElement=driver.findElementById("draggable");
		WebElement dropElement=driver.findElementById("droppable");
		
		builder.dragAndDrop(dragElement, dropElement).perform();
		
		String expectedText="Dropped";
		
		if((dropElement.getText()).contains(expectedText))
		{
			System.out.println("Action successfully done");
		}

// 3.Click&Hold Release - builder.clickAndHold(dragElement).release(dropElement).perform();
// 4. keyUp and keyDown - builder.keyUp(Keys.CONTROL).click(dragElement).click(dropElement).keyDown(Keys.CONTROL).perform();
				
	}	
		
	public static void takeSnap() throws IOException
	{
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/Learning/img"+i+".png");
		FileUtils.copyFile(src, dest);
		i++;
	}
}
