package seleniumhomeworks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String args[]) throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		String url="https://wet-boew.github.io/v4.0-ci/demos/tables/tables-en.html";
		driver.get(url);
		
		Thread.sleep(10000);

		WebElement table=driver.findElementByXPath("//table[contains(@class,'wb-tables')]/tbody");
		List<WebElement> allRows=table.findElements(By.tagName("tr"));
		
		for(int i=0;i<allRows.size();i++)
		{
			WebElement selectedRow=allRows.get(i);
			List<WebElement>allCols=selectedRow.findElements(By.tagName("td"));	
			for(int j=0;j<allCols.size();j++)
			{
				WebElement selectedCol=allCols.get(j);
				String value=selectedCol.getText();
			
				if(value.equals("Firefox 1.5"))
				{
					System.out.println("Row value is "+(i+1));
					System.out.println("Column value is "+(j+1));
				}
				
			}
	
		}
		
	}
}
