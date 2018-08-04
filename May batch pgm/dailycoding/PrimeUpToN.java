package dailycoding;

import java.util.Scanner;

public class PrimeUpToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res;
		
		int firstLoop,secondLoop,gnNo;
		
		
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		gnNo=ob.nextInt();
		
		for(firstLoop=2;firstLoop<gnNo;firstLoop++)
		{
			res=0;
			for(secondLoop=2;secondLoop<firstLoop;secondLoop++)
			{
				if(firstLoop%secondLoop==0)
				{
					res=1;
				}
			}
			if(res!=1)
			{
				System.out.print(firstLoop+",");
			}
		}
		System.out.println();
	}

}
