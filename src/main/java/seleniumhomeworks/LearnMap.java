package seleniumhomeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static void main(String args[])
	{
		Map<Integer, String> map=new HashMap<Integer,String>();
		
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4,"four");
		
		//System.out.println(map.get(2)); - based on key value it will print the result
				
		for(Entry<Integer, String> entry:map.entrySet())
		{
			int key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+" : "+value);
		}
	}
}
