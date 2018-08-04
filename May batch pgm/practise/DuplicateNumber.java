package practise;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number={10,12,14,16,18,20,14,10,55,55};
		
		//int a[]=new int[10];
		
		int[] res=new int[number.length];
		
		for(int i=0;i<number.length;i++)
		{
			for(int j=i+1;j<number.length;j++)
			{
				if(number[i]==number[j])
				{
					System.out.println("Duplicate number is "+number[i]);
				}
			}	
		}
	}
}
