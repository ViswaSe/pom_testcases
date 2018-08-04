package dailycoding;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input;
		System.out.println("Enter the given string");
		Scanner ob=new Scanner(System.in);
		input=ob.next();
		
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			output+=input.charAt(i);
		}
		
		System.out.println("Reverse String is "+output);
		
		if(input.equals(output))
		{
			System.out.println("The given string "+input+" is a palindrome");
		}
		else
		{
			System.out.println("The given string "+input+" is not a palindrome");
		}
	}

}
