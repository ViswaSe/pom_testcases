package seleniumhomeworks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		//Set<String> set=new HashSet<String>(); -- follows random order
		//Set<String> set=new LinkedHashSet<String>(); -- follows insertion order
		Set<String> set=new TreeSet<String>(); // follows ascending order
		
		set.add("vishveshwar");
		set.add("Sai harish");
		set.add("Harsha");
		set.add("Vijay Rohit");
		
		Iterator iter=set.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		System.out.println(set.contains("Harsha"));
		
	}

}
