package seleniumhomeworks;

import java.util.Scanner;

public class HarishHelp {
	
	public static void main(String args[])
	{
		
		System.out.println("Enter the distance in km and time value in km/hr");
		Scanner ob=new Scanner(System.in);
		
		int distance= ob.nextInt();
		int time=ob.nextInt();
		
		float speed=distance/time;
		
		System.out.println(speed);
		
	}

}
