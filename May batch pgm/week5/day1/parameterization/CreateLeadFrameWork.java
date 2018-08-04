package week5.day1.parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class CreateLeadFrameWork extends ProjectWrapper{
		
	//@Parameters({"userName","password"})
	@Test(dataProvider="getDataCreateLead")
	
//	public void doLogin(String uName,String password) //This is for parameters
	
	public void doLogin(String company,String fName,String lName) { //This is for Data provider
		
		WebElement userName=locateElement("id","username"); //Login - username
		type(userName,"DemoSalesManager");
		
		WebElement pwd=locateElement("id","password"); //Login - password
		type(pwd,"crmsfa");
		
		WebElement login=locateElement("class","decorativeSubmit"); //Login - login button
		click(login);
		
		WebElement crmsfaLink=locateElement("//img[@src='/opentaps_images/integratingweb/crm.png']"); //Click - crmsfa link
		click(crmsfaLink);
		
		WebElement createLead=locateElement("link","Create Lead"); //Click on create lead link
		click(createLead);
		
		WebElement compName=locateElement("id","createLeadForm_companyName"); //CompanyName
		type(compName,company);
		
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
		selectWebTable(table,4,4);
		
		WebElement submitButton=locateElement("name","submitButton"); //Create lead
		click(submitButton);		
		
	}
	
	
	@DataProvider(name="getDataCreateLead")
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="Cognizant";
		data[0][1]="Gobi";
		data[0][2]="Chand";		

		data[1][0]="Test leaf";
		data[1][1]="Babu";
		data[1][2]="M";		
		
		return data;
	}
}
