/**
 * 
 * @author Sumanth
 *
 */

package array;

public class FirstMaxWithoutSorting {
	
	public static void main(String[] args) {
		
		int[] a= {8,3,4,32,2,4,5};
		
		//First maximum
		int max= a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("First Maximum is: "+max);
		
		
		//First minimum
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("First Minumum is: "+min);
				
	}

}
