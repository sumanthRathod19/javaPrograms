package Assignment2;

import java.util.HashSet;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		int a[] = {2,4,1,5,5,4};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
			
		}
		System.out.println(set);
	}

}
