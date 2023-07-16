package Assignment3;

import java.util.LinkedHashSet;

public class PositionOfEachEleWithoutDuplicate {
	
	public static void main(String[] args) {
		
		int[] a= {4,3,2,3,1};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);	
		}
		
		for(int num: set)
		{
			
			for(int i=0; i<a.length; i++)
			{
				if(num==a[i])
				{
					System.out.println(num+" is at "+(i+1));
					break;
				}
			}
			
		}
	}

}
