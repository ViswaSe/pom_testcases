package practise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int gnNumber;
		
		Scanner ob=new Scanner(System.in);
		gnNumber=ob.nextInt();
	
		int res=1;
		
		while(gnNumber>0)
		{
			res*=gnNumber;
			gnNumber--;
		}
		
		System.out.println(res);
		
	}

}
