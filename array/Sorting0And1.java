/**
 * 
 * @author Sumanth
 *
 */


package array;

//{0,0,1,0,1,0,1} => {0,0,0,0,1,1,1}

public class Sorting0And1 {
	
	public static void main(String[] args) {
		
		int[] a = {0,0,1,0,1,0,1};
		
		int m = 0;
		int n = a.length-1;
		
		int[] temp = new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==0)
			{
				temp[m]=a[i];
				m++;
			}
			
			else 
			{
				temp[n]= a[i];
				n--;
			}
		}
		
		for(int j=0; j<temp.length; j++)
		{
			System.out.print(temp[j]+" ");
		}
		
	}

}
