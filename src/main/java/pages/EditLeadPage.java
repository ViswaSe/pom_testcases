package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.Annotations1;

public class EditLeadPage extends Annotations1{
	
	public EditLeadPage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="updateLeadForm_firstName")
	WebElement eleFirstName;	
	public EditLeadPage clearFirstName()
	{
		clear(eleFirstName);
		return this;
	}
	
	public EditLeadPage editFirstName(String updFName)
	{
		type(eleFirstName,updFName);
		return this;
	}
	
	@FindBy(className="smallSubmit")
	WebElement eleSubmitButton;
	public ViewLeadsPage clickSubmit()
	{
		click(eleSubmitButton);
		return new ViewLeadsPage();
	}
}
