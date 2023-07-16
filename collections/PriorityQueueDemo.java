package collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		{
			PriorityQueue<Object> q = new PriorityQueue<>();
			q.add("Hi");
			q.add("Hello");
			q.add("HiHello");
			q.add("Bye");
			q.add("GoodBye");
			
			System.out.println(q);
			System.out.println(q.peek());  //will fetch the first element and does not remove
			System.out.println(q);
			System.out.println(q.poll());  //will fetch the first element and remove   
			System.out.println(q);
		}
	}

}
