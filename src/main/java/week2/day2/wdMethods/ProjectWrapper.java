package week2.day2.wdMethods;

public class ProjectWrapper extends SeMethods{
	
	public void login()
	{
		startApp("chrome","http://leaftaps.com/opentaps");
	}
	
	public void closeApp()
	{
		closeBrowser();
	}

}
