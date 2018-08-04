package dailycoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixDiagonal {

	public static void main(String[] args) {
		
		int n;
		
		Scanner ob=new Scanner(System.in);
		n=ob.nextInt();
		int arr[][]=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=ob.nextInt();
			}
		}
		System.out.println("Given matrix is ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int row=n;
		int column=n;
		
		sprial(row,column,arr);
		
	}

	public static void sprial(int row, int column,int[][] arr) {
		
		int r=0,c=0;
		
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list1=new ArrayList<Integer>();
		System.out.println();
		
	/*	//forward diagonal
		
		for(int i=0;i<row;i++)
		{
			for(int j=i;j<=i;j++)
			{
				list.add(arr[i][j]);
			}
		}
*/		
		int temp=row-1;
		int temp1=column-2;
		
		for(int i=0;i<=temp;i++)
		{
			for(int j=c;j<=temp1;j++)
			{
				list.add(arr[i][j]);
			}
			temp1--;
		}
	
		int sum1=0;
		int sum2=0;
		
		for(int each:list)
		{
			sum1=sum1+each;
		}
		
		System.out.println("The sum of previous value from the diagonal is "+sum1);
	
		int temp2=temp;
		
		for(int i=1;i<=temp;i++)
		{
			for(int j=temp2;j<=temp;j++)
			{
				list1.add(arr[i][j]);
			}
			temp2--;
		}
		
		for(int each:list1)
		{
			sum2=sum2+each;
		}
		
		System.out.println("The sum of later value from the diagonal is "+sum2);
		
		if(sum1>sum2)
		{
			for(int each:list)
			{
				System.out.print(each+" ");
			}
		}
		else
		{
			for(int each:list1)
			{
				System.out.print(each+" ");
			}
		}
	}
}
