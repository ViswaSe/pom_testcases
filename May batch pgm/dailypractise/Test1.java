package dailypractise;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// Input : ram saravanan suresh ganesh dinesh || Output : R. S. S. G. DINESH
		
		Scanner ob=new Scanner(System.in);

		String s[]=new String[5];
		
		for(int i=0;i<5;i++)
		{
			s[i]=ob.next();
		}
		
		String res="";
		
		String temp="";
		
		for(int i=0;i<s.length-1;i++)
		{
			temp=temp.concat(""+s[i].charAt(0)).toUpperCase().concat(".");
		}
		
		res=temp+res.concat(s[s.length-1]).toUpperCase();
		
		System.out.println(res);
	}

}
