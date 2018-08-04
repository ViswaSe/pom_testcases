package dailycoding;

import org.openqa.selenium.chrome.ChromeDriver;

public class ErailCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		
		boolean res=driver.findElementById("chkSelectDateOnly").isSelected();

		System.out.println(res);
	}

}
