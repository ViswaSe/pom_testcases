package dailycoding;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no1,no2;
		
		Scanner ob=new Scanner(System.in);
		no1=ob.nextInt();
		no2=ob.nextInt();
		
		for(int i=no1;i<=no2;i++)
		{
			if(i%3==0&&i%5==0)
			{
				System.out.print("FizzBuzz");
			}
			else if(i%3==0)
			{
				System.out.print("Fizz");
			}
			else if(i%5==0)
			{
				System.out.print("Buzz");
			}
			else
			{
				System.out.print(i);
			}
			
			System.out.print(" ");
		}
		
	}
}
