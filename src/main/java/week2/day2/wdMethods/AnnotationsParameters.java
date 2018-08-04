package week2.day2.wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class AnnotationsParameters extends SeMethods{
	
	@Parameters({"url","uName","pwd"})
	@BeforeMethod()
	public void login(String url,String uName,String password)
	{
		startApp("chrome",url); //Launch the browser
		
		WebElement userName=locateElement("id","username"); //Login - username
		type(userName,uName);
		
		//verifyTitle("Leaftaps - TestLeaf Automation Platform");
		//verifyExactAttribute(userName,"id","userName");
		//Thread.sleep(2000); //For validation of webDriver exception
		
		WebElement pwd=locateElement("id","password"); //Login - password
		type(pwd,password);
		
		WebElement login=locateElement("class","decorativeSubmit"); //Login - login button
		click(login);
		
		WebElement crmsfaLink=locateElement("//img[@src='/opentaps_images/integratingweb/crm.png']"); //Click - crmsfa link
		click(crmsfaLink);
	
	}
	
	@AfterMethod()
	public void close()
	{
		closeBrowser();
	}

}
