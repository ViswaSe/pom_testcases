package codingchallenge;

public class SwapString {

	public static void main(String[] args) {
		
		String s1="Selenium";
		String s2="fever";

		System.out.println("Before Swapping: ");
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		
		s1=s1.concat(s2);
		s2=s1.substring(0, (s1.length()-s2.length()));
		s1=s1.replaceAll(s2, "");

		
		System.out.println("After Swapping: ");
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
	}

}
