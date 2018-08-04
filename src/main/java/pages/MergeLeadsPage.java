package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.Annotations1;

public class MergeLeadsPage extends Annotations1 {
	
	public MergeLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//img[@src='/images/fieldlookup.gif'])[1]")
	WebElement eleFromLeadIcon;
	public FindLeadsPage clickFromLeadIcon()
	{
		click(eleFromLeadIcon);
		switchToWindow(1);
		return new FindLeadsPage();
	}

	@FindBy(xpath="(//img[@src='/images/fieldlookup.gif'])[2]")
	WebElement eleToLeadIcon;
	public FindLeadsPage clickToLeadIcon()
	{
		click(eleToLeadIcon);
		switchToWindow(1);
		return new FindLeadsPage();
	}

	@FindBy(linkText="Merge")
	WebElement mergeButton;
	
	public ViewLeadsPage clickMergeButton()
	{
		clickWithoutSS(mergeButton);
		acceptAlert();
		return new ViewLeadsPage();
	}
	
}
