package learnexcel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week2.day2.wdMethods.AnnotationsParameters;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class CreateLeadFrameworkExcel extends AnnotationsParameters{

	@Test(dataProvider="fetchData")
	
	public void createLead(String cName,String fName,String lName,String Phone,String emailId) {
		
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
		WebElement createLead=locateElement("link","Create Lead"); //Click on create lead link
		click(createLead);
		
		WebElement compName=locateElement("id","createLeadForm_companyName"); //CompanyName
		type(compName,cName);
		
		WebElement firstName=locateElement("id","createLeadForm_firstName"); //FirstName
		type(firstName,fName);
		
		WebElement lastName=locateElement("id","createLeadForm_lastName"); //LastName
		type(lastName,lName);
		
		WebElement source=locateElement("id","createLeadForm_dataSourceId"); //SourceDropdown
		selectDropDownUsingIndex(source,4);
	
		WebElement industry=locateElement("id","createLeadForm_industryEnumId"); //Industry drop down
		selectDropDownUsingText(industry, "IND_SOFTWARE");
		
		WebElement calendar=locateElement("id","createLeadForm_birthDate-button"); //calendar button
		click(calendar);
		
		WebElement table=locateElement("//div[@class='calendar']"); //select value in webtable
		selectWebTable(table,4,4, "tr", "td");
		
		WebElement phoneNumber=locateElement("id","createLeadForm_primaryPhoneNumber");
		type(phoneNumber,Phone);
		
		WebElement email=locateElement("id","createLeadForm_primaryEmail");
		type(email,emailId);
		
		WebElement submitButton=locateElement("name","submitButton"); //Create lead
		click(submitButton);		
		
		//closeBrowser();
		
	}

	@DataProvider(name="fetchData",indices={0,1})
	public Object[][] getData() throws IOException
	{
		ReadExcel excel=new ReadExcel();
		return excel.readExcel("CreateLead");
	}

}
