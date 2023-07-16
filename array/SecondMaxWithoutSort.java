/**
 * 
 * @author Sumanth
 *
 */

package array;


public class SecondMaxWithoutSort {
	
	public static void main(String[] args) {
		int[] a= {8,3,4,32,2,4,5};
		
		int max= a[0];
		int max2=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i])
			{
				if(a[i]!=max)
				{
					max2=max;
				}
				max=a[i];
			}
			
			else if(max==max2 || max2<a[i])
			{
				max2=a[i];
			}
		}
		System.out.println("First Maximum is: "+max);
		System.out.println("Second Maximum is: "+max2);
	}

}
