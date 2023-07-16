package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Object> list = new LinkedList<>();
		
		list.add(10);
		list.add("hi");
		list.add(null);
		list.add(10);
		list.add(20);
		list.add("Bye");
		list.add(30);
		
		list.addFirst("First");
		list.addLast("Last");
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(1));
		
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		
		System.out.println(list.remove(3));
		//System.out.println(list.removeLastOccurrence(20));
		
		
		LinkedList<Object> list2 = new LinkedList<>();
		list2.add(30);
		list2.add("hi");
		list2.add(10);
		list2.add(0);
		list2.add(5);
		
		list.retainAll(list2); // show the duplicates in list2 with respect to list
		System.out.println(list);
		System.out.println(list.removeAll(list2));   //remove the duplicates present in list2 with respect to list
		System.out.println(list);
		
		list.addAll(list2);    //Add all the values to the list
		for(Object ob : list)  //fetch value present in list one by one
		{
			System.out.println(ob);
		}
		
		
		
	}
}
