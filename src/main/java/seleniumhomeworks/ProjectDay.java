package seleniumhomeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import week2.day2.wdMethods.SeMethods;

public class ProjectDay{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String url="https://www.flipkart.com/";	
		driver.get(url);
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		
		Actions builder=new Actions(driver);
		WebElement tv=driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement samsung=driver.findElementByXPath("(//span[text()='Samsung'])[2]");
		
		builder.moveToElement(tv).pause(2000).click(samsung).perform();
	
		Thread.sleep(5000);
		
		WebElement minPrice=driver.findElementByXPath("(//select[@class='fPjUPw'])[1]");
		Select ob=new Select(minPrice);
		ob.selectByVisibleText("₹25000");
		
		WebElement maxPrice=driver.findElementByXPath("(//select[@class='fPjUPw'])[2]");
		Select obj=new Select(maxPrice);
		obj.selectByVisibleText("₹60000");
		
		WebElement screensize=driver.findElementByXPath("(//div[@class='_3xglSm _1iMC4O'])[2]");
		Thread.sleep(3000);
		screensize.click();
		driver.findElementByXPath("//div[text()='48 - 55']").click();
		
		Thread.sleep(5000);
	
		WebElement firstTv=driver.findElementByXPath("//div[@class='_1-2Iqu row']/div[1]/div");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(firstTv));
		firstTv.click();
		
		Set<String> windows=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(windows);
		String myWindow=list.get(1);
		
		driver.switchTo().window(myWindow);
		
		driver.findElementByXPath("//span[text()='Compare']").click();
		
		driver.close();
		
		String parentWindow=list.get(0);
		driver.switchTo().window(parentWindow);
		
		driver.findElementByXPath("(//div[@class='_1-2Iqu row'])[2]/div[1]/div").click();
		
		Set<String> windows1=driver.getWindowHandles();
		List<String> list1=new ArrayList<String>(windows1);
		String childWindow=list1.get(1);
		
		driver.switchTo().window(childWindow);
		
		driver.findElementByXPath("//span[text()='Compare']").click();
	
		driver.findElementByXPath("//a[@class='_1h5zc_ sTOdGz']").click();
	
		Thread.sleep(3000);
		String price1=driver.findElementByXPath("(//div[@class='_1vC4OE'])[1]").getText();
		String exp1=price1.replaceAll("\\D+", "");
		int rate1=Integer.parseInt(exp1);
		
		String price2=driver.findElementByXPath("(//div[@class='_1vC4OE'])[2]").getText();
		String exp2=price2.replaceAll("\\D+", "");
		int rate2=Integer.parseInt(exp2);
	
		if(rate1>rate2)
		{
			Thread.sleep(3000);
			driver.findElementByXPath("(//button[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c'])[3]").click();
		}
		else
		{
			Thread.sleep(3000);
			driver.findElementByXPath("(//button[@class=_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c'])[4]").click();
		}
		
	}

}
