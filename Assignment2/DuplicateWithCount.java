package Assignment2;

import java.util.HashSet;

public class DuplicateWithCount {
	
	public static void main(String[] args) {
		
		int a[] = {2,4,1,5,5,4,5,1};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		System.out.println(set);
		
		for(int n : set)
		{
			int count=0;
			
			for(int j=0; j<a.length; j++)
			{
				if(n==a[j])
				{
					count++;
				}
			}
			
			if(count>=2)
			{
				System.out.println(n+" occured "+count+" times");
			}
			
		}
	}

}
