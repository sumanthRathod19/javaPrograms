package Assignment3;

import java.util.LinkedHashSet;

public class UniqueEleInArray {
	
	public static void main(String[] args) {
		
		int[] a= {4,3,2,3,1};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		
		System.out.println(set);
	}

}
