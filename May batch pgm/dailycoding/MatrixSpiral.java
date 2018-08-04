package dailycoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixSpiral {

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
		System.out.println();
		System.out.println("Before Spiral order");
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
		System.out.println();
		System.out.println("After spiral order");
		
		if(r<row&&c<column)
		{
			//print first row - all columns
			for(int i=c;i<=column-1;i++)
			{
				//System.out.print(arr[r][i]+" ");
				list.add(arr[r][i]);
			}
			
			r++;
			
			//print last value in remaining rows
			for(int i=r;i<column;i++)
			{
				//System.out.print(arr[i][column-1]+" ");
				list.add(arr[i][column-1]);
			}
			
			
			//print last row values
			for(int i=row-2;i>=c;i--)
			{
				//System.out.print(arr[row-1][i]+" ");
				list.add(arr[row-1][i]);
			}
			
			
			
			//print first column remaining values
			for(int i=row-2;i>=r;i--)
			{
				//System.out.print(arr[i][c]+" ");
				list.add(arr[i][c]);
			}
			
			
			//print 2nd row remaining values
			for(int i=r;i<row-2;i++)
			{
				//System.out.print(arr[r][i]+" ");
				list.add(arr[r][i]);
			}
			
			
			//print 3rd row remaining values
			for(int i=row-2;i>=r;i--)
			{
				//System.out.print(arr[row-2][i]);
				list.add(arr[row-2][i]);
			}
		}
		
		for(int res:list)
		{
			System.out.print(res+" ");
		}
		System.out.println();
	}

}
