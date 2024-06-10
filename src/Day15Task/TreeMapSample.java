package Day15Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample 
{
	public static void main(String args[]) 
	{
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(1, "Arun");
		tm.put(2, "Saranya");
		tm.put(3, "Bala");
		tm.put(4, "Fiaz");
		System.out.println("Before Sorting:");
		for(Map.Entry m :tm.entrySet() )
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("After Sorting:");
		List <String> lst = new ArrayList<>();
		for(Map.Entry m :tm.entrySet() )
		{
			lst.add((String)m.getValue());	
		}
		Collections.sort(lst);
		System.out.println(lst);
	}

}