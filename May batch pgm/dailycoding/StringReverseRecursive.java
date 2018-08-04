package dailycoding;

import java.util.Scanner;

public class StringReverseRecursive {
	
	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		String s=ob.nextLine();
		
		StringReverseRecursive obj=new StringReverseRecursive();
		
		String res=obj.reverseString(s);
		
		System.out.println(res);
	}
	
	public String reverseString(String str)
	{
		
		if(str.length()==0||str.length()<=1)
			return str;
		
		return reverseString(str.substring(1)) + str.charAt(0);
		
	}
	
}
