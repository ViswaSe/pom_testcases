package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.Annotations1;

public class FindLeadsPage extends Annotations1{
	
	public String eleLeadFirstName;
	
	public FindLeadsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='id']")
	WebElement eleLeadIdField;
	public FindLeadsPage typeLeadId(String leadId)
	{
		type(eleLeadIdField,leadId);
		return this;
	}
	
	@FindBy(xpath=("(//input[@name='firstName'])[3]"))
	WebElement eleFirstName;
	public FindLeadsPage typeFirstName(String fName)
	{
		type(eleFirstName,fName);
		return this;
	}
	
	@FindBy(xpath=("(//input[@name='firstName'])"))
	WebElement eleFirstNameChild;
	public FindLeadsPage typeFirstNameChild(String fName)
	{
		type(eleFirstNameChild,fName);
		return this;
	}
	
	@FindBy(xpath="//button[contains(text(),'Find Leads')]")
	WebElement eleFindLeadsButton;
	public FindLeadsPage clickFindLeadsButton()
	{
		click(eleFindLeadsButton);
		return this;
	}
	
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")
	WebElement eleLeadName;
	
	public FindLeadsPage getLeadName()
	{
		leadName_findLeads=getText(eleLeadName);
		return this;
	}
	
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")
	WebElement eleLeadId;
	public FindLeadsPage getLeadId()
	{
		expWait(eleLeadId);
		leadId_findLeads=getText(eleLeadId);
		return this;
	}
	
	@FindBy(xpath="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	WebElement eleFirstResultingLead;
	public ViewLeadsPage clickFirstResultingLead()
	{
		expWait(eleFirstResultingLead);
		click(eleFirstResultingLead);
		return new ViewLeadsPage();
	}
	
	public MergeLeadsPage clickFirstResultingLeadChild()
	{
		expWait(eleFirstResultingLead);
		clickWithoutSS(eleFirstResultingLead);
		switchToWindow(0);
		return new MergeLeadsPage();
	}
	
	
	@FindBy(xpath="//span[text()='Email']")
	WebElement eleEmailButton;
	public FindLeadsPage clickEmailTab()
	{
		click(eleEmailButton);
		return this;
	}
	
	@FindBy(name="emailAddress")
	WebElement eleEmail;
	public FindLeadsPage typeEmailAddress(String email)
	{
		type(eleEmail,email);
		return this;
	}

	@FindBy(xpath="//span[text()='Phone']")
	WebElement elePhone;
	public FindLeadsPage clickPhone()
	{
		click(elePhone);
		return this;
	}
	
	@FindBy(name="phoneNumber")
	WebElement elePhoneNumber;
	public FindLeadsPage typePhoneNumber(String phoneNo)
	{
		type(elePhoneNumber,phoneNo);
		return this;
	}
	
	@FindBy(xpath="//div[text()='No records to display']")
	WebElement eleNoRecords;
	public FindLeadsPage verifyErrorMessage(String expMessage)
	{
		verifyPartialText(eleNoRecords, expMessage);
		return this;
	}
}
