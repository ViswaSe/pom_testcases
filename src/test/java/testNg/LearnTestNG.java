package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnTestNG {
 
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is before suite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is before test");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This is before class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println();
		System.out.println("This is before method");
	}
	///@Test(/*invocationCount=5,timeOut=20000*/)
	
	@Test(priority=2,timeOut=2000)
	public void g() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("@Test2");
	}
	
	
	//@Test(priority=2,dependsOnMethods={"g"},alwaysRun=true)
	@Test(enabled=false)
	public void f() {
	  
	  System.out.println("@Test");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is after method");
		System.out.println();
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("This is after class");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is after test");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is after suite");
	}
	
}
