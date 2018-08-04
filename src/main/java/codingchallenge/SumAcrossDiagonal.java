package codingchallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAcrossDiagonal {

	public static void main(String[] args) {
		
		int row=6;
		int col=6;
		int arr[][]=new int[row][col];

		Scanner ob=new Scanner(System.in);
		
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list1=new ArrayList<Integer>();
	
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=ob.nextInt();
			}
		}
		
		System.out.println("Matrix form: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//To find the sum of numbers above diagonal
		int temp=0;
		int sum=0;
		
		System.out.println("Above diagonal Values are : ");
		for(int i=row-2;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(arr[temp][j]+ " ");
				sum=sum+arr[temp][j];
				list.add(arr[temp][j]);
			}
			temp++;
		}
		
		System.out.println();
		System.out.println("The Sum of above diagonal value is "+sum);
		System.out.println();
		
		//To find the sum of numbers below diagonal
		int secTemp=1;
		int secSum=0;
		System.out.println("Below diagonal Values are : ");
		for(int i=row-1;i>0;i--)
		{
			for(int j=row-1;j>=i;j--)
			{
				System.out.print(arr[secTemp][j]+" ");
				secSum=secSum+arr[secTemp][j];
				list1.add(arr[secTemp][j]);
			}
			secTemp++;
		}
		
		System.out.println();
		System.out.println("The sum of below diagonal value is "+secSum);
		System.out.println();
		
		if(secSum>sum)
		{
			for(int each:list1)
			{
				System.out.print(each+" ");
			}
			System.out.println();
		}
		else
		{
			for(int each:list)
			{
				System.out.print(each+" ");
			}
			System.out.println();
		}
	}
	
}
