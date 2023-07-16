package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<Object> set = new HashSet<>();
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
