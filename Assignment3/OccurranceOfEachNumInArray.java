package Assignment3;

import java.util.LinkedHashSet;

public class OccurranceOfEachNumInArray {
	
	public static void main(String[] args) {
		
        int[] a= {4,3,2,3,1};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		
		for(int num: set)
		{
			int count=0;
			for(int i=0; i<a.length; i++)
			{
				if(num==a[i])
				{
					count++;
				}
			}
			System.out.println(num+" occurred "+count+" times");
		}
	}

}
