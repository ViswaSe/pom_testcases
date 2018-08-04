package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;

public class Tc_002_EditLeadTestCase extends Annotations1{

	@BeforeTest
	public void setValues()
	{
		testCase ="TC002_Edit Lead";
		testDesc="Edit a lead in Test Leaf";
		iteration="Leads";
		author="Vishveshwar";
		category="Smoke";
	    fileName="Tc_002_EditLead_TestCase";
	}
	
	@Test(dataProvider="fetchData")
	public void editLead(String fName,String title,String updFName)
	{
		new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.typeFirstName(fName)
		.clickFindLeadsButton()
		.clickFirstResultingLead()
		.verifyViewLeadTitle(title)
		.clickEditButton()
		.clearFirstName()
		.editFirstName(updFName)
		.clickSubmit()
		.verifyFirstName(updFName);
		
	}
	
}
