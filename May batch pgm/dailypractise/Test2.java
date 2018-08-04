package dailypractise;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Input Sundaraman a || Output : 4
		
		Scanner ob=new Scanner(System.in);
		String input=ob.next();
		String s=ob.next();
		int count=0;
		
		for(int i=0;i<input.length();i++)
		{
			if((""+input.charAt(i)).matches(s))
			{
				count++;
			}
		}
		
		System.out.println("The word "+s+" in the letter "+input+ " is " +count);
	}

}
