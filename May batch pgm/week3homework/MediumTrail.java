package week3homework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MediumTrail {

	public static void main(String[] args) throws InterruptedException {
		
		String url="https://www.myntra.com/";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		//In Searchbox type "Sunglasses" and Enter

		WebElement searchBox=driver.findElementByClassName("desktop-searchBar");
		searchBox.sendKeys("Sunglasses",Keys.ENTER);
		
		//Print all unique brand names of the Sunglasses 
		
		WebElement allGlasses=driver.findElementByClassName("results-base");
		List<WebElement> Glass=allGlasses.findElements(By.className("product-brand"));

		List<String> glassText=new ArrayList<String>();
		
		for(WebElement each:Glass)
		{
			String text=each.getText();
			glassText.add(text);
		}
		
		Set<String> glassTxt=new LinkedHashSet<String>();
		glassTxt.addAll(glassText);
		
		int size=glassTxt.size();
		
		for(String each:glassTxt)
		{
			System.out.println(each);
		}
		System.out.println(size);

	//Get the count of the sunglasses with 40% discounts
		
		WebElement discount=driver.findElementByClassName("discount-list");
		discount.click();
		
		List<WebElement> discSunGlasses=allGlasses.findElements(By.className("product-brand"));
		int discSunGlassCount=discSunGlasses.size();
		
	//And the print count of the product those are Unisex

		WebElement gls=driver.findElementByClassName("results-base");
		List<WebElement> unisexSunGlasses=gls.findElements(By.className("product-product"));
		
		List<String> unisexGls=new ArrayList<String>();
		
		for(WebElement each:unisexSunGlasses)
		{
			String text=each.getText();
			unisexGls.add(text);
		}
		
		Set<String> unisexGlsText=new LinkedHashSet<String>();
		unisexGlsText.addAll(unisexGls);
		
		int unisexCount=unisexGlsText.size();
		System.out.println(unisexCount);
		
	//Click on Green color Filter icon

		driver.findElementByXPath("//li[@data-colorhex='green']/label").click();
	
	//Click on second listed search result of the sun glasses

		WebElement colorgls=driver.findElementByClassName("results-base");
		List<WebElement> unisexClrGls=gls.findElements(By.className("product-base"));
		WebElement secondUnisexClrGls=unisexClrGls.get(1);
		Thread.sleep(3000);
		secondUnisexClrGls.click();
		
	//Print the name of the product
		
		WebElement secGlsName=driver.findElementByClassName("pdp-title");
		String secondGlassName=secGlsName.getText();
		System.out.println(secondGlassName);
	
	//Click Add to Bag 
		Thread.sleep(3000);
		WebElement addToBag=driver.findElementByXPath("//button[@class='pdp-add-to-bag pdp-button']");
		addToBag.click();
		
	//Go to Bag
		
		WebElement goToBag=driver.findElementByXPath("//span[@class='myntraweb-sprite desktop-iconBag sprites-bag']");
		goToBag.click();
	
	//Verify product name
		
		WebElement prodName=driver.findElementByClassName("prod-name");
		String productName=prodName.getText();
		
		if(productName.equalsIgnoreCase(secondGlassName))
		{
			System.out.println("Product name is matching successfully "+productName);
		}
		
	}
}
