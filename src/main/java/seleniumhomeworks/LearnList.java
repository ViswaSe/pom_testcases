package seleniumhomeworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class LearnList {

	public static void main(String[] args) {
		
		List<String> ob=new ArrayList<String>();
		
		
		ob.add("vishveshwar");
		ob.add("sai harish");
		ob.add("harsha");
		ob.add("vijay rohit");
		
/*		Iterator iter=ob.iterator();

		while(iter.hasNext())
		{
			Object next = iter.next();
			System.out.println(next);
		}*/
	
		for(String each:ob)
		{
			System.out.println(each);
		}
		
		System.out.println(ob.indexOf("vishveshwar"));
	
		ob.set(0, "Viswa");
		System.out.println(ob);
		
		
		
	}

}
