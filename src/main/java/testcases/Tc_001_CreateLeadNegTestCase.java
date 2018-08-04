package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;

public class Tc_001_CreateLeadNegTestCase extends Annotations1 {
	
	@BeforeTest
	public void setValues()
	{
		testCase ="TC001_Create Lead_Negative Scenario";
		testDesc="Capture the error message in Create Lead module";
		iteration="Leads";
		author="Vishveshwar";
		category="Smoke";
	    fileName="Tc_001_CreateLead_Neg_TestCase";
	}
	
	@Test(dataProvider="fetchData")
	public void createLeadNegCase(String cName,String fName,String lName,String errMsg)
	{
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickForSubmitFailure()
		.verifyErrorMessage(errMsg);
	}

}
