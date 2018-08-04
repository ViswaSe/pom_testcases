package codingchallenge;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class IntegerUnique {

	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		
		String temp=""+n;
		int length=temp.length();
		int val=1; int temp2=length;
		
		while(temp2>1)
		{
			val=val*10;
			temp2--;
		}
		
		int res;
		
		Set<Integer> set=new TreeSet<Integer>();
		
		for(int i=0;i<length;i++)
		{
			res=n/val;
			n=n%val;
			val=val/10;
			
			set.add(res);
		}
		
		for(int each:set)
		{
			System.out.println(each);
		}
	}
}
