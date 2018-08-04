package testNg;


import org.testng.annotations.Test;


public class TestNG1 extends TestNGAnnotations{
  //@Test(groups={"smoke"})
  @Test()
  public void f() throws InterruptedException {
	  //Thread.sleep(4000);
	  System.out.println("@Test1");
  }
  @Test
  public void extra()
  {
	  System.out.println("@Test 1.1");
  }
}
