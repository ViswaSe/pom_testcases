package dailycoding;
import java.util.Scanner;

public class StringUniqueChar {

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		String inp=ob.nextLine();
		
		String input=inp.replaceAll("\\s","");
		
		int size=input.length();
		String output="";
		
		for(int i=0;i<size;i++)
		{
			int temp=output.indexOf(input.charAt(i));
			if(temp==-1)
			{
				output+=input.charAt(i);
			}
		}
		System.out.println(output);
	}

}
