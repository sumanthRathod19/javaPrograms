package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Object> st = new Stack<>();
		st.push(20);
		st.push(10);  //Last In
		
		System.out.println(st);
		
		System.out.println(st.pop());    //10   First Out
		System.out.println(st.pop());    //20
	}
}
