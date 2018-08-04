package practise;

import org.testng.annotations.Test;

public class LearnSuite extends NewTest{
	
	@Test(groups="functional")
	public void newMethod()
	{
		System.out.println("New method is running");
	}

}
