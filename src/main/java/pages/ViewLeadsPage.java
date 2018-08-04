package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.Annotations1;

public class ViewLeadsPage extends Annotations1{
	
	public ViewLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="viewLead_firstName_sp")
	WebElement eleFirstName;
	public ViewLeadsPage verifyFirstName(String expName)
	{
		verifyPartialText(eleFirstName,expName);
		return this;
	}
	
	public ViewLeadsPage verifyViewLeadTitle(String expected)
	{
		verifyTitle(expected);
		return this;
	}
	
	@FindBy(linkText="Edit")
	WebElement eleEditButton;
	public EditLeadPage clickEditButton()
	{
		click(eleEditButton);
		return new EditLeadPage();
	}

	
	@FindBy(linkText="Duplicate Lead")
	WebElement eleDuplicateButton;
	public DuplicateLeadPage clickDuplicateLead()
	{
		click(eleDuplicateButton);
		return new DuplicateLeadPage();
	}

	@FindBy(className="subMenuButtonDangerous")
	WebElement eleDeleteButton;
	public MyLeadsPage clickDeleteLead()
	{
		click(eleDeleteButton);
		return new MyLeadsPage();
	}
	
	@FindBy(linkText="Find Leads")
	WebElement eleFindLeads;
	public FindLeadsPage clickFindLeads()
	{
		click(eleFindLeads);
		return new FindLeadsPage();
	}
	
}
