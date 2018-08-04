package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;

public class Tc_004_DeleteLeadTestCase extends Annotations1{

	@BeforeTest
	public void setValues()
	{
		testCase ="TC004_Delete Lead";
		testDesc="Delete a lead in Test Leaf";
		iteration="Leads";
		author="Vishveshwar";
		category="Smoke";
	    fileName="Tc_004_DeleteLeadTestCase";
	}
	
	@Test(dataProvider="fetchData")
	public void editLead(String phoneNo,String errMsg)
	{
		new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.typePhoneNumber(phoneNo)
		.clickFindLeadsButton()
		.getLeadId()
		.clickFirstResultingLead()
		.clickDeleteLead()
		.clickFindLeads()
		.typeLeadId(leadId_findLeads)
		.clickFindLeadsButton()
		.verifyErrorMessage(errMsg);
	}
	
}
