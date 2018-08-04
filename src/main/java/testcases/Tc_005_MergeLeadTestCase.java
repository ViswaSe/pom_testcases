package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;

public class Tc_005_MergeLeadTestCase extends Annotations1{
	
	@BeforeTest
	public void setValues()
	{
		testCase ="TC005_Merge Lead";
		testDesc="Merge leads in Test Leaf";
		iteration="Leads";
		author="Vishveshwar";
		category="Smoke";
	    fileName="Tc_005_MergeLeadTestCase";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createLeadTestCase(String firstLeadName,String lastLeadName,String expMessage)
	{
		new MyHomePage()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLeadIcon()
		.typeFirstNameChild(firstLeadName)
		.clickFindLeadsButton()
		.getLeadId()
		.clickFirstResultingLeadChild()
		.clickToLeadIcon()
		.typeFirstNameChild(lastLeadName)
		.clickFindLeadsButton()
		.clickFirstResultingLeadChild()
		.clickMergeButton()
		.clickFindLeads()
		.typeLeadId(leadId_findLeads)
		.clickFindLeadsButton()
		.verifyErrorMessage(expMessage);
		
	}

}
