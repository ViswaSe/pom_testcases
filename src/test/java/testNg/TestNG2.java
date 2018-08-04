package testNg;
import org.testng.annotations.Test;


public class TestNG2 extends TestNGAnnotations{
  //@Test(groups="smoke")
  @Test
  public void f() {
	  System.out.println("@Test2");
  }

}
