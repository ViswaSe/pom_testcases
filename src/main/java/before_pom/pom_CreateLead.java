package before_pom;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testcases.Annotations1;

public class pom_CreateLead extends Annotations1{
	public String testCase, testDesc, iteration, author, category, fileName;
	
	@BeforeTest
	public void setValues()
	{
		testCase ="TC001_Create Lead";
		testDesc="Create a lead in Test Leaf";
		iteration="Leads";
		author="Vishveshwar";
		category="Smoke";
	    fileName="CreateLead";
		
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String cName,String fName,String lName,String Phone,String emailId) {
		
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
	
	}
}
