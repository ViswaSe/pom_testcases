package dailypractise;

import java.util.Scanner;

public class Classmain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no1,no2;
		
		Scanner ob=new Scanner(System.in);
		
		no1=ob.nextInt();
		no2=ob.nextInt();
		
		Class1 obj1=new Class1();
		Class2 obj2=new Class2();
		
		int add=obj1.add(no1, no2);
		int sub=obj2.sub(no1, no2);
		
		long mobileno=obj1.getUserContact();
		String name=obj2.myName();
		
		System.out.println(name+" "+mobileno+" ");
		System.out.println("Addition value is "+add);
		System.out.println("Subraction value is "+sub);
	}

}
