package codingchallenge;

import java.util.Scanner;

public class ReverseString_Num {

	
	public static String s="";
	public static String s1="";
	public static String s2="";
	public static String temp="";
	
	public static int count=0;
	public static int count1=0;
	public static int i=0;
	public static int j=0,res=0;
	public static int val=1;
	public static int mul=1;
	
	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s=ob.nextLine();

		System.out.println("Enter the Integer: ");
		i=ob.nextInt();
		
		count=s.length()-1;
		s2=reverseString();
		
		temp=Integer.toString(i);
		count1=temp.length()-1;
		
		System.out.println("The Reversal string is "+s2);
	
		int tempCount=count1;
		
		while(tempCount>0)
		{
			val=val*10;
			tempCount--;
		}
		
		int res=reverseInt();
		System.out.println("The Reversal Value is "+res);
	}

	private static int reverseInt() {
		
		while(count1>=0)
		{
			j=i%10;
			i=i/10;
			res+=j*val;
			count1--;
			val=val/10;
			mul=mul*10;
			reverseInt();
		}
		
		return res;
	}

	private static String reverseString() {
		
		while(count>=0)
		{
			s1=s1+s.charAt(count);
			count--;
			reverseString();
		}	
		
		return s1;
		
	}
}
