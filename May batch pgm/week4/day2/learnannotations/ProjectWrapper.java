package week4.day2.learnannotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import week2.day2.wdMethods.SeMethods;

public class ProjectWrapper extends SeMethods {
	
	@BeforeMethod
	public void login()
	{
		startApp("chrome","http://leaftaps.com/opentaps");
	}
	
	@AfterMethod
	public void closeApp()
	{
		closeBrowser();
	}

}
