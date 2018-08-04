package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.Annotations1;

public class DuplicateLeadPage extends Annotations1{

	public DuplicateLeadPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public DuplicateLeadPage verifyDuplicateLeadTitle(String expected)
	{
		verifyTitle(expected);
		return this;
	}
	
	@FindBy(className="smallSubmit")
	WebElement eleCreateLeadButton;
	public ViewLeadsPage clickCreateButton()
	{
		click(eleCreateLeadButton);
		return new ViewLeadsPage();
	}
	
}
