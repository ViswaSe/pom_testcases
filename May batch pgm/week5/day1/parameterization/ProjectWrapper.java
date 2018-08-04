package week5.day1.parameterization;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import week2.day2.wdMethods.SeMethods;

public class ProjectWrapper extends SeMethods {
	
	@Parameters("url")
	@BeforeMethod
	public void login(String url)
	{
		startApp("chrome",url);
	}
	
	@AfterMethod
	public void closeApp()
	{
		closeBrowser();
	}

}
