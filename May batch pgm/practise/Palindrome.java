package practise;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputNumber;
		
		Scanner obj=new Scanner(System.in);
		inputNumber=obj.nextInt();
		int reverseNumber=0;
		int sum=0;
		int originalInputNumber=inputNumber;
		
		while(inputNumber>0)
		{
			reverseNumber=inputNumber%10;
			inputNumber=inputNumber/10;
			sum=(sum*10)+reverseNumber;
		}
		//System.out.println(inputNumber);
		System.out.println(sum);
		
		if(originalInputNumber==sum)
		{
			System.out.println("The given integer is a palindrome");
		}
		else
		{
			System.out.println("The given integer is not a palindrome");
		}
			
	}

}
