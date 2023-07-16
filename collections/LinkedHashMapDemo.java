package collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
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
		
		
	}

}
