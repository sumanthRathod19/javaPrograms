package collections;

import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> map = new Hashtable<>();
		map.put(10, "hi");
		map.put(20, "Hello");
		map.put(10, "Hello");  //duplicates key are not allowed
		map.put(5, "Bye");
		map.put(3, "Hello");
		
		//map.put(null, "abc");  // null not allowed
		//map.put(4, null);  // not allowed
		
		System.out.println(map);
		System.out.println(map.remove(20));
		System.out.println(map.size());
		System.out.println(map.containsKey(5));
		System.out.println(map.replace(5, "super"));
		System.out.println(map.get(10));
		System.out.println(map);
	}

}
