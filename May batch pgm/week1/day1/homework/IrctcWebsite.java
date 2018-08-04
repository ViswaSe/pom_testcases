package week1.day1.homework;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcWebsite {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("Vishveshwar");
		driver.findElementById("userRegistrationForm:password").sendKeys("VichuDurga06@");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("VichuDurga06@");
		
		//security drop down
		
		WebElement securityQ=driver.findElementById("userRegistrationForm:securityQ");
		Select sdd=new Select(securityQ);
		sdd.selectByValue("2");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Vijay");
		
		//preferred language
		WebElement lan=driver.findElementById("userRegistrationForm:prelan");
		Select ldd=new Select(lan);
		ldd.selectByVisibleText("English");
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Vishveshwar");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("D");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Duraiswamy");
		
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		
		//Dateofbirth - date
		
		WebElement date=driver.findElementById("userRegistrationForm:dobDay");
		Select ddd=new Select(date);
		ddd.selectByIndex(0);
		
		//Dateofbirth - mnth
		WebElement month=driver.findElementById("userRegistrationForm:dobMonth");
		Select mdd=new Select(month);
		mdd.selectByIndex(mdd.getOptions().size()-1);
		
		List<WebElement> allMonths=mdd.getOptions();
		
		for (WebElement eachMonth : allMonths) 
		{
			System.out.println(eachMonth.getText());
		}
		
		System.out.println(allMonths.size());
		
		//Dateofbirth - year
		WebElement year=driver.findElementById("userRegistrationForm:dateOfBirth");
		Select ydd=new Select(year);
		ydd.selectByVisibleText("1994");
		
		//Occupation drop down
		WebElement occupation=driver.findElementById("userRegistrationForm:occupation");
		Select odd=new Select(occupation);
		odd.selectByIndex(3);
		
		//personal details
		
		driver.findElementById("userRegistrationForm:uidno").sendKeys("750290333");
		driver.findElementById("userRegistrationForm:idno").sendKeys("AVXPV5422F");
		
		//Country drop down
		
		WebElement country=driver.findElementById("userRegistrationForm:countries");
		Select cdd=new Select(country);
		cdd.selectByValue("94");
				
		driver.findElementById("userRegistrationForm:email").sendKeys("vichuharish06@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9578184957");
		
		//Nationality drop down
		
		WebElement nationality=driver.findElementById("userRegistrationForm:nationalityId");
		Select ndd=new Select(nationality);
		ndd.selectByIndex(1);
		
		driver.findElementById("userRegistrationForm:address").sendKeys("2D/15");
		driver.findElementById("userRegistrationForm:street").sendKeys("Nanganallur");
		driver.findElementById("userRegistrationForm:area").sendKeys("Chennai");
		
		driver.findElementById("userRegistrationForm:pincode").sendKeys("603103",Keys.TAB);
		Thread.sleep(6000);
		
		//city drop down
		WebElement city=driver.findElementById("userRegistrationForm:cityName");
		Select cidd=new Select(city);
		cidd.selectByIndex(1);
		Thread.sleep(3000);
	
		//post office drop down
		WebElement postoffice=driver.findElementById("userRegistrationForm:postofficeName");
		Select pdd=new Select(postoffice);
		pdd.selectByIndex(2);
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("9578184957");
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		
	}

}
