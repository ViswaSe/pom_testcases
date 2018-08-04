package codingchallenge;

import java.util.Scanner;

public class FindLeapYear {

	public static void main(String[] args) {

		System.out.println("Enter how many years you want to check:");
		
		Scanner ob=new Scanner(System.in);
		
		int option=ob.nextInt();
		
		for(int i=0;i<option;i++)
		{
			System.out.println();
			System.out.println("Enter the year you want to check:");
			int year=ob.nextInt();

			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("The given year is a leap year");
				}
				else
				{
					System.out.println("The given year is not a leap year");
				}
			}

			else if(year%4==0)
			{
				System.out.println("The given year is a leap year");
			}

			else
			{
				System.out.println("The given year is not a leap year");
			}
		}
	}

}
