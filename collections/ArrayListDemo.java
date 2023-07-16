package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("hi");
		list.add(null);
		list.add(null);
		
		System.out.println(list);
		list.add(2, "Hello");   //in index 2
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(20);
		list2.add(5);
		list2.add(1);
		list2.add(30);
		Collections.sort(list2);   //used to add list2 to list
		System.out.println(list2);
		
		list.addAll(list2);
		System.out.println(list);
		
		
		if(list.contains("hi")) // used to check object is present or not
		{
			System.out.println("is present"); 
		}
		
		else
		{
			System.out.println("not present");
		}
		
		 System.out.println(list.remove(1));   // will remove the element present in index2
		 
		 for(Object obj: list)  //used to fetch element one by one using for each loop
		 {
			 System.out.println(obj);
		 }	
	}

}
