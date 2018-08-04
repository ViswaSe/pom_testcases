package dailypractise;

public class LearnString {

	public static void main(String[] args) {

		
		/*
		 
		 1.Starts-with,ends-with = boolean
		 2.charAt(integer) = character
		 3.split(string) = string[]
		 4.length() = integer
		 5.equals(),equalsIgnoreCase() = boolean
		 6.contains() = boolean
		 7.trim() = string 
		 
		 */
		
		String s="Vishveshwar";
		//System.out.println(s.charAt(1));
		//System.out.println(s.length());
		//System.out.println(s.startsWith("V"));
		//System.out.println(s.endsWith("r"));
		//System.out.println(s.contains("vesh"));
		//System.out.println(s.trim());
		
		/*String[] sp = s.split("v");
		
		for(String each:sp)
		{
			System.out.println(each);
		}
		*/
		
		//System.out.println(s.concat(" duraiswamy"));
		//System.out.println(s.equals("vishveshwar"));
		//System.out.println(s.equalsIgnoreCase("vishveshwar"));
		//System.out.println(s.compareTo("vishveshwar"));
		//System.out.println(s.compareToIgnoreCase("vishveshwar"));
		//System.out.println(s.indexOf('h'));
		//System.out.println(s.lastIndexOf('h'));
		//System.out.println(s.indexOf("V"));
		//int res=s.lastIndexOf('h', 4);
		//System.out.println(res);
		//System.out.println(s.toUpperCase());
		//System.out.println(s.toLowerCase());
		
		/*char[] res=s.toCharArray();
		
		for(char each:res)
		{
			System.out.println(each);
		} */
		
		//System.out.println(s.matches("Vishveshwar"));
	
		String part=s.substring(0, 4);
		System.out.println(part);
		
	}

}
