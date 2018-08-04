package dailycoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestSequence {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter the total count of numbers");
		Scanner ob=new Scanner(System.in);
		n=ob.nextInt();
		int inputArray[]=new int[n];
		System.out.println("Enter the numbers: ");
		
		for(int i=0;i<n;i++)  //To get the values in an array
		{
			inputArray[i]=ob.nextInt();
		}
		
		//place the negative numbers in a list
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			if(inputArray[i]<0)
			{
				list.add(inputArray[i]);
			}
		}
		
		LongestSequence obj=new LongestSequence();
		
		int count=0;
		int temp=0;
	
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			
			while(list.get(count)!=inputArray[i])
			{
				if(inputArray[i]>0)
				{
					arr[temp]=inputArray[i];temp++;
				}
			}
			count++;
		}
		
		System.out.println(arr);
	}
}
