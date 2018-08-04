	package practise;
	
	import org.testng.annotations.Test;
	import org.testng.annotations.Test;
	
	public class testNGAnnotations extends NewTest{
	
		@Test(groups="sanity")
		public void first()
		{
			System.out.println("First test method");
		}
		
		@Test(groups="smoke")
		public void last()
		{
			System.out.println("last test method");
		}
	}
