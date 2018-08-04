package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.Annotations1;

public class MyHomePage extends Annotations1{
	
	
	public MyHomePage()
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(linkText="Leads")
	WebElement eleLeads;
	public MyLeadsPage clickLeads()
	{
		click(eleLeads);
		return new MyLeadsPage();
	}
	
}
