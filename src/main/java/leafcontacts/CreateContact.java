package leafcontacts;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import week2.day2.wdMethods.SeMethods;

public class CreateContact extends SeMethods{
	
	@Test
	public void createContact()
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
		
		WebElement createContact=locateElement("link","Create Contact");
		click(createContact);
		
		WebElement firstName=locateElement("id","firstNameField");
		type(firstName,"Babu");
		
		WebElement lastName=locateElement("id","lastNameField");
		type(lastName,"sir");
		
		WebElement birthDate=locateElement("id","createContactForm_birthDate-button");		
		click(birthDate);
		
		WebElement table=locateElement("//div[@class='calendar']/table[1]");
		selectWebTable(table,2,2,"tr","td");
		
		WebElement rupee=locateElement("id","createContactForm_preferredCurrencyUomId");
		expWait(rupee);
		selectDropDownUsingText(rupee,"INR");
		
		WebElement primaryMail=locateElement("id","createContactForm_primaryEmail");
		type(primaryMail,"Babu.selenium@testleaf.com");
			
		WebElement phoneNumber=locateElement("id","createContactForm_primaryPhoneNumber");
		type(phoneNumber,"937463732387");		
		
		WebElement createContactButton=locateElement("class","smallSubmit");
		click(createContactButton);
		
	}

}
