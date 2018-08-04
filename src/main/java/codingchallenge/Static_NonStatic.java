package codingchallenge;

public class Static_NonStatic {

	public static String var1="Hello";
	public String var2="World";
	
	public static void main(String[] args) {
		
		m1(); //direct calling from static method
		Static_NonStatic ob=new Static_NonStatic();
		ob.m2(); // we can call non static only by creating an object

	}
	public static void m1()
	{
		Static_NonStatic ob1=new Static_NonStatic();
		
		System.out.println(var1);
		System.out.println(ob1.var2); //If we want to use the static varaible inside non static method then we have to create an object
	}
	
	public void m2()
	{
		System.out.println(var1);
		System.out.println(var2);
	}
}
