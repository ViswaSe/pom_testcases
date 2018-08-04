package practise;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String res="";
		String input;
		
		Scanner ob=new Scanner(System.in);
		input=ob.next();
		
		
		String originalInput=new String(input);
		
		for(int i=input.length()-1;i>=0;i--)
		{
			res+=input.charAt(i);
		}
		
		System.out.println(res);
		if(res.equals(originalInput))
		{
			System.out.println("The given string is a palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
	}

}
