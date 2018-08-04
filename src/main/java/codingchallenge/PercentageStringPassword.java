package codingchallenge;

import java.util.Scanner;

public class PercentageStringPassword
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		String s=ob.nextLine();
		int length=s.length();
		
		float uCase=0,lCase=0,digits=0,SpChar=0;
		
		for(int i=0;i<s.length();i++)
		{	
			if(Character.isUpperCase(s.charAt(i)))
			{
				uCase++;
			}
			
			if(Character.isLowerCase(s.charAt(i)))
			{
				lCase++;
			}
			
			if(Character.isDigit(s.charAt(i)))
			{
				digits++;
			}
			if(!(Character.isLetterOrDigit(s.charAt(i))))
			{
				SpChar++;
			}
			
			
		}
		
		int count=s.length();
		System.out.println("Total Length : "+count);
		System.out.println("Upper Case :"+uCase);
		System.out.println("Lower Case :" +lCase);
		System.out.println("Digits are : " +digits);
		System.out.println("Special Character : " +SpChar);
		
		System.out.println();
		System.out.println("Percent value is ");
		System.out.println("Uppercase : "+(uCase/count)*100);
		System.out.println("Lowercase : "+(lCase/count)*100);
		System.out.println("Digits : " +(digits/count)*100);
		System.out.println("Special Characters : "+(SpChar/count)*100);
		
		
	}

}
