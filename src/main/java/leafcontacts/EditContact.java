package leafcontacts;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import week2.day2.wdMethods.SeMethods;

public class EditContact extends SeMethods {

	@Test
	public void editContact()
	{
		startApp("chrome","http://leaftaps.com/opentaps/control/main");
		
		WebElement userName=locateElement("id","username");
		type(userName,"DemoSalesManager");
		
		WebElement password=locateElement("id","password");
		type(password,"crmsfa");
		
		WebElement login=locateElement("class","decorativeSubmit");
		click(login);
	
		WebElement crmsfa=locateElement("//img[@src='/opentaps_images/integratingweb/crm.png']");
		click(crmsfa);
		
		WebElement contacts=locateElement("link","Contacts");
		click(contacts);
		
		WebElement findContacts=locateElement("link","Find Contacts");
		click(findContacts);
		
		WebElement firstName=locateElement("(//input[@name='firstName'])[3]");
		type(firstName,"Babu");
		
		WebElement findcontacts=locateElement("//button[text()='Find Contacts']");
		click(findcontacts);
	
		WebElement firstResultingContact=locateElement("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
		expWait(firstResultingContact);
		clickWithoutSS(firstResultingContact);
		
		WebElement editLead=locateElement("link","Edit");
		click(editLead);
		
		WebElement nameToBeUpdate=locateElement("id","updateContactForm_firstName");
		nameToBeUpdate.clear();
		type(nameToBeUpdate,"BABU");
		
		WebElement updateLead=locateElement("class","smallSubmit");
		click(updateLead);
		
		if(verifyTitle("View Contact | opentaps CRM"))
		{
			WebElement updatedName=locateElement("id","viewContact_firstName_sp");
			String expected="BABU";
			verifyExactText(updatedName,expected);
		}
			
	}
	
}
