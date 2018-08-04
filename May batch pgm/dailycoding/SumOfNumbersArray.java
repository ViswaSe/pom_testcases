package dailycoding;

import java.util.Scanner;

public class SumOfNumbersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[5];
		
		int res=0;
		
		System.out.println("Enter the values in an array: ");
		Scanner ob=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ob.nextInt();
		}
		
		for(int temp:arr)
		{
			res+=temp;
		}
		System.out.println("Sum of Numbers in an Array " +res);
	}

}
