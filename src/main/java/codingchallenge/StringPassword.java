package codingchallenge;

import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ob=new Scanner(System.in);

		System.out.println("Enter how many iterations you want");
		int n=ob.nextInt();
	
		while(n>0)
		{		
			int count=0;
			int upperCase=0;

			System.out.println("Enter the password: ");
			String s=ob.next();
			
			for(int i=0;i<s.length();i++)
			{
				char temp=s.charAt(i);

				if(Character.isLetterOrDigit(temp))
				{
					count++;

					if(Character.isUpperCase(temp))
					{
						upperCase++;
					}
				}
			}

			if(upperCase>0&&count>=2&&s.length()>=10)
			{
				System.out.println("Valid Password");
			}

			else
			{
				System.out.println("Invalid password");
			}

			n--;
		}
	
	}
}
