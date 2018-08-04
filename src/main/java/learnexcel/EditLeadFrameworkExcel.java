package learnexcel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week2.day2.wdMethods.Annotations;

public class EditLeadFrameworkExcel extends Annotations{

	@Test(dependsOnMethods="learnexcel.CreateLeadFramework.createLead",dataProvider="fetchData")
	
	public void doEdit(String fname,String uName) throws InterruptedException
	{
		click(locateElement("link","Leads"));
		click(locateElement("link","Find Leads"));
		type(locateElement("(//input[@name='firstName'])[3]"), fname);
		click(locateElement("//button[contains(text(),'Find Leads')]"));
		Thread.sleep(3000);
		click(locateElement("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		verifyTitle("View Lead | opentaps CRM");
		click(locateElement("//a[contains(text(),'Edit')]"));
		WebElement dropDown=locateElement("id", "updateLeadForm_industryEnumId");
		WebElement leadName=locateElement("id","firstName");
		type(leadName,uName);
		selectDropDownUsingText(dropDown, "IND_SOFTWARE");
		click(locateElement("//input[@class='smallSubmit']"));

	}

	@DataProvider(name="fetchData")
	public Object[][] getData() throws IOException
	{
		ReadExcel excel=new ReadExcel();
		return excel.readExcel("EditLead");
	}

}
