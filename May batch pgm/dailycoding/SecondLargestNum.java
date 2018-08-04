package dailycoding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={10,24,33,55,5,-20};
		Arrays.sort(a);
		List<Integer> lst=new ArrayList<Integer>();
		
		for(int res:a)
		{
			lst.add(res);
		}
		
		System.out.println("The second largest Number in an array is "+lst.get((lst.size())-2));
	}
		
}
