package dailycoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={13,65,15,67,88,65,13,99,67,13,65,87,13};
		List getList=findDuplicate(a);
		
		System.out.println(getList);
		
		int b[]=new int[getList.size()];
		
		for(int i=0;i<b.length-1;i++)
		{
			if(getList.get(i)==getList.get(i+1))
			{
				continue;
			}
			else
			b[i]=(int) getList.get(i);
		}
		
		List getList1=findDuplicate(b);
	
		System.out.println(getList1);
		
	}

	
	public static List findDuplicate(int a[])
	{	
		int arr[]=new int[a.length];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=a[i];
		}
		
		List<Integer> lst=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(a[i]==a[j])
				{
					lst.add(arr[i]);
				}
			}
		}
		return lst;
	}

}
