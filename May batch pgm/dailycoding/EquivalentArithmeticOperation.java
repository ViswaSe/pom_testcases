package dailycoding;

import java.util.Scanner;

public class EquivalentArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNo,secondNo;
		String val;
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the integers: ");
		firstNo=ob.nextInt();
		secondNo=ob.nextInt();
		
		System.out.println("Enter the action to be performed:");
		val=ob.next();
		
		switch(val)
		{
		case "add": System.out.println("Addition");
		System.out.println("Result is : "+(firstNo+secondNo));
		break;
		
		case "sub": System.out.println("Subraction");
		System.out.println("Result is :"+(firstNo-secondNo) );
		break;
		
		case "mul": System.out.println("Subraction");
		System.out.println("Result is :"+(firstNo*secondNo) );
		break;
		
		case "div": System.out.println("Subraction");
		System.out.println("Result is :"+(firstNo/secondNo) );
		break;
		
		default:System.out.println("Invalid action selected");
		
		}
		
	}

}
