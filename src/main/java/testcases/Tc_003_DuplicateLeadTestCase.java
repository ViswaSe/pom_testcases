package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;

public class Tc_003_DuplicateLeadTestCase extends Annotations1{

	@BeforeTest
	public void setValues()
	{
		testCase ="TC003_Duplicate Lead";
		testDesc="Create a Duplicate lead in Test Leaf";
		iteration="Leads";
		author="Vishveshwar";
		category="Smoke";
	    fileName="Tc_003_DuplicateLead_TestCase";
	}
	
	@Test(dataProvider="fetchData")
	public void editLead(String email)
	{
		new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.clickEmailTab()
		.typeEmailAddress(email)
		.clickFindLeadsButton()
		.getLeadName()
		.clickFirstResultingLead()
		.clickDuplicateLead()
		.clickCreateButton()
		.verifyFirstName(leadName_findLeads);
	}
	
}
