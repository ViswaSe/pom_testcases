package dailycoding;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		Thread.sleep(2000);
		
		boolean seleniumCB=driver.findElementByXPath("(//div[@class='example'])[2]/input[1]").isSelected();
		System.out.println("Before Action Selenium check box: "+seleniumCB);
		
		driver.findElementByXPath("(//div[@class='example'])[2]/input[1]").click();
		
		boolean seleniumCB1=driver.findElementByXPath("(//div[@class='example'])[2]/input[1]").isSelected();
		System.out.println("After Action Selenium Check box:"+seleniumCB1);
		
		boolean imSelCB=driver.findElementByXPath("(//div[@class='example'])[3]/input[2]").isSelected();
		System.out.println("Before Action Im Selected Check box: "+imSelCB);
		
		driver.findElementByXPath("(//div[@class='example'])[3]/input[2]").click();
		boolean imSelCB1=driver.findElementByXPath("(//div[@class='example'])[3]/input[2]").isSelected();
		System.out.println("After Action Im Selected Check box :"+imSelCB1);
		
		driver.close();
		
	}

}
