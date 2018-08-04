package codingchallenge;

public class StringSpaceTrim {

	public static void main(String[] args) {
		
		String s="  aa bbbbb    ccc   dd  ";
		
		System.out.println("Before removing space: "+s);
		
		for(int i=0;i<s.length();i++)
		{
			s=s.replaceAll("  ", " ");
		}
		
		s=s.trim();
		
		System.out.println("After removing space: "+s);
	}

}
