package dailycoding;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no1,no2;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the 2 numbers:");
		no1=obj.nextInt();
		no2=obj.nextInt();
		
		System.out.println("Before Swapping " + no1 + " "+ no2);
		
		no1=no1+no2; // no1=5
		no2=no1-no2; //no2=2
		no1=no1-no2; //no1=3
		
		System.out.println("After Swapping "+no1+" "+no2);
	}

}
