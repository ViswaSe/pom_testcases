package codingchallenge;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTestLeaf {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String url="http://testleaf.herokuapp.com/pages/Dropdown.html";
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement dropDown=driver.findElementById("dropdown1");
		Select ob=new Select(dropDown);
		List<WebElement> list=ob.getOptions();
		
		String text=list.get(list.size()-1).getText();
		
		ob.selectByVisibleText(text);
	}

}
