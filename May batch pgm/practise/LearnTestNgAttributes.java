package practise;

import org.testng.annotations.Test;

public class LearnTestNgAttributes {
	
	//@Test(invocationCount=2,threadPoolSize=2)
	//@Test(invocationCount=2,invocationTimeOut=2000)
	/*@Test(priority=1)
	public void beforeTest()
	{
		System.out.println("Before Test is running");
	}
	
	@Test(priority=0,dependsOnMethods={"beforeTest"})
	public void beforeTest1()
	{
		System.out.println("Before Test is running 2nd time");
	}*/
	
	@Test
	public void fail()
	{
		throw new RuntimeException();
	}
	
	@Test(alwaysRun=true,dependsOnMethods="fail")
	public void beforeTest()
	{
		System.out.println("Before Test is running");
	}
	@Test(enabled=false)
	public void third()
	{
		System.out.println("It will not run");
	}
	
	@Test(successPercentage=80)
	public void last()
	{
		System.out.println("Pass");
	}
}
