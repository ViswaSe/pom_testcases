package codingchallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestArray {

	public static void main(String[] args) {

		int arr[]={20,340,21,879,92,21,474,83687,-299};

		//int arr[]={3,4,5,6,7,-2};
		
		System.out.println("Before sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		System.out.println(); 
		
		Arrays.sort(arr);
		
		List<Integer> list=new ArrayList<Integer>();
	
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
	
		int total=list.size();
		System.out.println("After sorting the array: ");
		
		for(int each:list)
		{
			System.out.print(each+" ");
		}
		System.out.println();
		System.out.println(); 
		
		System.out.println("The second largest Number is "+(list.get(total-2)));
		
	}

}
