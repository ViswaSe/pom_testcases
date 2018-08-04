package week2.day2.homework;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class CreateLead extends FrameWork{
	
	@Test
	public void call()
	{
		invokeBrowser("http://leaftaps.com/opentaps");
		
		WebElement userName=locateElement("id","username"); //Entering User name text field
		type(userName,"DemoSalesManager");
		
		WebElement pwd=locateElement("id","password"); //Entering password text field
		type(pwd,"crmsfa");
		
		WebElement login=locateElement("class","decorativeSubmit"); //login button clicked
		clickWithScreenshot(login);
		
		WebElement crmsfa=locateElement("XPath","//img[@src='/opentaps_images/integratingweb/crm.png']"); //click on the crmsfa link
		clickWithScreenshot(crmsfa);
		
		WebElement createLead=locateElement("link","Create Lead"); //createLead link clicked
		//explictWait(createLead);
		clickWithScreenshot(createLead);
		
		WebElement companyName=locateElement("id","createLeadForm_companyName"); //Entering company name
		type(companyName,"Cognizant");
		
		WebElement firstName=locateElement("id","createLeadForm_firstName"); //Entering lead first Name
		type(firstName,"Gobi");
		
		WebElement lastName=locateElement("id","createLeadForm_lastName"); //Entering lead last Name
		type(lastName,"Chand");
		
		WebElement source=locateElement("id","createLeadForm_dataSourceId");   //Drop down selection
		selectDropDownByIndex(source,4);
	
		WebElement calendar=locateElement("id","createLeadForm_birthDate-button"); //Selecting value from web table
		clickWithScreenshot(calendar);
		WebElement table=locateElement("XPath","//div[@class='calendar']/table[1]");
		WebElement resultValue=webTable(table,5,2);
		clickWithScreenshot(resultValue);
	
		
		WebElement mobNo=locateElement("id","createLeadForm_primaryPhoneNumber"); //Entering Lead Phone number
		type(mobNo,"9578184957");
		
		WebElement email=locateElement("id","createLeadForm_primaryEmail"); //Entering lead email id
		type(email,"vichucts@gmail.com");
		
		WebElement createButton=locateElement("name","submitButton"); //Click on Create lead to create the lead.
		clickWithScreenshot(createButton);
		
		driver.close();
	
	}
	
	

}
