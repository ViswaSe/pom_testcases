package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;

public class Tc_001_CreateLeadTestCase extends Annotations1{
	
	@BeforeTest
	public void setValues()
	{
		testCase ="TC001_Create Lead";
		testDesc="Create a lead in Test Leaf";
		iteration="Leads";
		author="Vishveshwar";
		category="Smoke";
	    fileName="Tc_001_CreateLead_TestCase";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void createLeadTestCase(String cName,String fName,String lName)
	{
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickSubmit()
		.verifyFirstName(fName);
	}

}
