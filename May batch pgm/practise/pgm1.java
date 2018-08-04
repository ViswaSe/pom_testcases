package practise;


interface i1
{
	public void findElement();
}

public class pgm1 implements i1{

	public static void main(String[] args) {
		
		i1 ob=new pgm1(); //WebDriver driver=new ChromeDriver(); create the reference for interface
		pgm1 ob1=new pgm1(); //ChromeDriver driver=new ChromeDriver(); create an object for class
		
		ob.findElement(); //using interface reference we can only access the interface methods.
		
		ob1.findElement();
		ob1.findElementById();  //using class object we can access both the class and interfacce methds
		
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
		System.out.println("This method helps to find the element");
		
	}
	
	public void findElementById()
	{
		System.out.println("This method is in the class helps to find the element");
	}

}
