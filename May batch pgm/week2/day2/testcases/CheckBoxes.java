package week2.day2.testcases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import week2.day2.wdMethods.SeMethods;

public class CheckBoxes extends SeMethods{

	@Test
	public void validateCheckBox() {
	
		String url="https://www.irctc.co.in/eticketing/loginHome.jsf";
		startApp("chrome",url);
		WebElement otp=locateElement("//div[@class='grid_5 labeltxt']/input[1]");
		clickWithoutSS(otp);
		expWait(otp);
		verifySelected(otp);
	
		WebElement userName=driver.findElementById("usernameId");
		verifyExactAttribute(userName,"id","usernameId");
		
		verifyPartialAttribute(userName,"id","usernameId");
		
	}

}
