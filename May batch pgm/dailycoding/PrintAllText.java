package dailycoding;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		WebElement occupation=driver.findElementById("userRegistrationForm:occupation");
		Select occDD=new Select(occupation);
		List<WebElement> occupationOptions=occDD.getOptions();
		//Print the text in occupation drop down
		for(WebElement eachOccupation:occupationOptions)
		{
			System.out.println(eachOccupation.getText());
		}
		
	}

}
