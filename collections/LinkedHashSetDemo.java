package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Object> set = new LinkedHashSet<>();
		
		set.add(10);
		set.add(10);
		set.add(null);
		set.add(null);
		set.add("Hello");
		set.add("Hi");
		set.add(20);
		
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.remove(20));
		System.out.println(set);
		System.out.println(set.size());
		
		if(set.contains("Hi"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("Not Present");
		}
		
		Iterator<Object> i = set.iterator();
		
		while(i.hasNext())
		{
			
			System.out.println(i.next());
		}
	}

}
