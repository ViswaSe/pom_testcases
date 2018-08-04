package codingchallenge;

public class StringUnique {

	public static void main(String[] args) {
		
		String s="good looking";
		String s1="";
		int count=0;
		
		char c[]=s.toCharArray();
		
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if((c[i]!=c[j])&&(!s1.contains(""+c[i])))
				{
					s1=s1+c[i];
				}
			}
		}
		s1 = s1.replaceAll(" ","");
		System.out.println(s1);
	}

}
