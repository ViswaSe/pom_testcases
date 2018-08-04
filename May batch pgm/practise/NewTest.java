package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
 
  @BeforeMethod(groups="common")
  public void beforeMethod() {
	  System.out.println("Before method will run before each test method");
  }

  @AfterMethod(groups="common")
  public void afterMethod() {
	  System.out.println("After method will run after each test method");
  }

  @BeforeClass(groups="common")
  public void beforeClass() {
	  System.out.println("Before class will run before each class");
  }

  @AfterClass(groups="common")
  public void afterClass() {
	  System.out.println("After class will run after each class");
  }

  @BeforeTest(groups="common")
  public void beforeTest() {
	  System.out.println("Before test will run before each test");
  }

  @AfterTest(groups="common")
  public void afterTest() {
	  System.out.println("After test will run before each test");
  }

  @BeforeSuite(groups="common")
  public void beforeSuite() {
	  
	  System.out.println("Before suite will run only once before running suite");
  }

  @AfterSuite(groups="common")
  public void afterSuite() {
	  System.out.println("After suite will run after the suite ends");
  }
}
