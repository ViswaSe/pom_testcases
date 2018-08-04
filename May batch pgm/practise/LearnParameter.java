package practise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameter {

	//@Parameters({"name","id"})
	
	@Test()
	public void getString(String name,int id)
	{
		System.out.println("User name : " + name);
		System.out.println("Password : "+ id);
	}
	
}
