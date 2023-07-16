package collections;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(10, "hi");
		map.put(20, "Hello");
		map.put(10, "Hello");  //duplicates key are not allowed
		map.put(5, "Bye");
		map.put(3, "Hello");
		map.put(15, null);
		map.put(25, null);
		
		System.out.println(map);
		System.out.println(map.size());
	}

}
