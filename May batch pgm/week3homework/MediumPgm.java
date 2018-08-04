package week3homework;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import week2.day2.wdMethods.SeMethods;

public class MediumPgm extends SeMethods
{
	@Test
	public void doCall() throws InterruptedException {
		
		String url="https://www.myntra.com/";
		startApp("chrome",url);
		WebElement searchBox=locateElement("class","desktop-searchBar");
		searchBox.sendKeys("Sunglasses",Keys.ENTER);
		
		WebElement allGlasses=locateElement("class","results-base");
		locateElementsUniquePrintWithSize(allGlasses,"product-brand");
		
		WebElement discount=locateElement("class","discount-list");
		clickWithoutSS(discount);
	
		WebElement unisexgls=locateElement("class","results-base");
		locateElementsUniquePrintWithSize(unisexgls,"product-product");
		
		WebElement greenClr=locateElement("//li[@data-colorhex='green']/label");
		expWait(greenClr);
		clickWithoutSS(greenClr);
		
		WebElement colorGlass=locateElement("class","results-base");
		WebElement selected=locateElementsSelection(colorGlass,"class","product-base",1);
		expWait(selected);
		clickWithoutSS(selected);
		
		WebElement selGls=locateElement("class","pdp-title");
		String glsText=getText(selGls);
		System.out.println(glsText);
		
		Thread.sleep(3000);
		WebElement addtoBag=locateElement("//button[@class='pdp-add-to-bag pdp-button']");
		clickWithoutSS(addtoBag);
		
		WebElement gotoBag=locateElement("//span[@class='myntraweb-sprite desktop-iconBag sprites-bag']");
		clickWithoutSS(gotoBag);
		
		WebElement prodName=locateElement("class","prod-name");
		String productName=getText(prodName);
		
		if(productName.equalsIgnoreCase(glsText))
		{
			System.out.println("Product name is matching successfully "+productName);
		}
		
		closeBrowser();
	}
	
	
}
