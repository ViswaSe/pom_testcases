package dailycoding;

public class Static_NonStatic {

	public static String s1="hello";
	public String s2="world";
	public static void main(String[] args) {
		m1();
		Static_NonStatic obj=new Static_NonStatic();
		obj.m2();
		
	}
	public static void m1()
	{
		System.out.println(s1);
	}
	public void m2()
	{
		System.out.println(s2);
	}

}
