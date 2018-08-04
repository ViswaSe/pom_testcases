package leafcontacts;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import week2.day2.wdMethods.SeMethods;

public class DeactivateContact extends SeMethods{

	@Test
	public void deactivateContact()
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
		
		WebElement phoneTab=locateElement("//span[text()='Phone']");
		click(phoneTab);
		
		WebElement phoneNumber=locateElement("name","phoneNumber");
		type(phoneNumber,"937463732387");
		
		WebElement findcontacts=locateElement("//button[text()='Find Contacts']");
		click(findcontacts);
		
		WebElement firstResultingContact=locateElement("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
		expWait(firstResultingContact);
		click(firstResultingContact);
		
		WebElement deactivateContact=locateElement("class","subMenuButtonDangerous");
		clickWithoutSS(deactivateContact);
		
		acceptAlert();
		
		if(verifyTitle("View Contact | opentaps CRM"))
		{
			WebElement warningMessage=locateElement("class","subSectionWarning");
			String warningText=getText(warningMessage);
			System.out.println(warningText);
			takeSnap();
		}
	}
	
}
