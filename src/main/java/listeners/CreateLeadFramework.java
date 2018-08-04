package listeners;

import org.testng.annotations.Test;

import week2.day2.wdMethods.Annotations;

import org.openqa.selenium.WebElement;

public class CreateLeadFramework extends Annotations{

	@Test(invocationCount=2)
	public void createLead() {
		
		/*startApp("chrome","http://leaftaps.com/opentaps"); //Launch the browser
		
		WebElement userName=locateElement("id","username"); //Login - username
		type(userName,"DemoSalesManager");
		
		//verifyTitle("Leaftaps - TestLeaf Automation Platform");
		//verifyExactAttribute(userName,"id","userName");
		//Thread.sleep(2000); //For validation of webDriver exception
		
		WebElement pwd=locateElement("id","password"); //Login - password
		type(pwd,"crmsfa");
		
		WebElement login=locateElement("class","decorativeSubmit"); //Login - login button
		click(login);
		
		WebElement crmsfaLink=locateElement("//img[@src='/opentaps_images/integratingweb/crm.png']"); //Click - crmsfa link
		click(crmsfaLink);
		*/
		WebElement createLead=locateElement("link","Create Lead1"); //Click on create lead link
		click(createLead);
		
		WebElement compName=locateElement("id","createLeadForm_companyName"); //CompanyName
		type(compName,"Cognizant");
		
		WebElement firstName=locateElement("id","createLeadForm_firstName"); //FirstName
		type(firstName,"Gobi");
		
		WebElement lastName=locateElement("id","createLeadForm_lastName"); //LastName
		type(lastName,"Chand");
		
		WebElement source=locateElement("id","createLeadForm_dataSourceId"); //SourceDropdown
		selectDropDownUsingIndex(source,4);
	
		WebElement industry=locateElement("id","createLeadForm_industryEnumId"); //Industry drop down
		selectDropDownUsingText(industry, "IND_SOFTWARE");
		
		WebElement calendar=locateElement("id","createLeadForm_birthDate-button"); //calendar button
		click(calendar);
		
		WebElement table=locateElement("//div[@class='calendar']"); //select value in webtable
		selectWebTable(table,4,4, "tr", "td");
		
		WebElement phoneNumber=locateElement("id","createLeadForm_primaryPhoneNumber");
		type(phoneNumber,"9578184957");
		
		WebElement email=locateElement("id","createLeadForm_primaryEmail");
		type(email,"vichucts@gmail.com");
		
		WebElement submitButton=locateElement("name","submitButton"); //Create lead
		click(submitButton);		
		
		//closeBrowser();
		
	}
	
}
