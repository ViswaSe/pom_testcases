package week4.day2.learngroups;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import week2.day2.wdMethods.SeMethods;

public class ProjectWrapper extends SeMethods {
	
	@BeforeMethod(groups="common")
	public void login()
	{
		startApp("chrome","http://leaftaps.com/opentaps");
	}
	
	@AfterMethod(groups="common")
	public void closeApp()
	{
		closeBrowser();
	}

}
