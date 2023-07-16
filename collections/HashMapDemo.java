package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(10, "hi");
		map.put(20, "Hello");
		map.put(10, "Hello");  //duplicates key are not allowed
		map.put(5, "Bye");
		map.put(3, "Hello");  //duplicate value are allowed
		map.put(null, "abc");  // one null key allowed
		map.put(null, "abcd");
		map.put(4, null);  // allowed
		map.put(2, null);  //allowed
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.containsKey(5));
		System.out.println(map.replace(5, "super"));
		System.out.println(map.get(10));
		System.out.println(map);
		
		for(Entry<Integer, String> m: map.entrySet())  //usage of for each loop in map
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}

}
