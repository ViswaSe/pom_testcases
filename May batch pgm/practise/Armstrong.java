package practise;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int gnNumber;
		Scanner ob=new Scanner(System.in);
		for(int i=100;i<1000;i++)
		{
			gnNumber=i;
			int finalRes=0;
			int res;
			int orgnNumber=gnNumber;
			while(gnNumber!=0)
			{
				res=gnNumber%10;
				finalRes+=res*res*res;
				gnNumber=gnNumber/10;

			}
			//System.out.println(finalRes);
		
			if(finalRes==orgnNumber)
			{
				System.out.println(finalRes+" is an armstrong number");
			}
				
		}

	}

}
