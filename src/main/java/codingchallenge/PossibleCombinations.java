package codingchallenge;

import java.util.Set;
import java.util.TreeSet;

public class PossibleCombinations {

	public static void main(String[] args) {
		
		int a=1234;
		
		String s=Integer.toString(a); //To calculate the length
		
		Set<String> set=new TreeSet<String>();
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				for(int k=0;k<s.length();k++)
				{
					if(i!=j&&j!=k&&k!=i)
					{
						set.add(""+s.charAt(i)+s.charAt(j)+s.charAt(k));
					}
				}
			}
		}

		System.out.println(set);
		
	}

}
