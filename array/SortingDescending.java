/**
 * 
 * @author Sumanth
 *
 */


package array;

public class SortingDescending {
	
public static void main(String[] args) {
		
		int[] a= {8,3,4,32,2,4,5};
		
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i; j<a.length; j++)
			{
				if(a[i]<a[j])  
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0; k<a.length; k++)
		{
			System.out.print(a[k]+" ");
		}
		
		System.out.println();
		
		//first maximum and minimum
		System.out.println("First Maximim Number is: "+a[0]);
		System.out.println("First Minimum Number is: "+a[a.length-1]);
		
		
		//second maximum and minimum
		System.out.println("Second Maximim Number is: "+a[1]);
		System.out.println("Second Minimum Number is: "+a[a.length-2]);
		
		
		//sum and multiplication of first three numbers
				int mult=1;
				int sum=0;
				
				for(int m=0; m<3; m++)
				{
					sum= sum+a[m];	
					mult= mult*a[m];
				}
				System.out.println("Sum of First 3 Numbers is: "+sum);
				System.out.println("Multiplication of First 3 Numbers is: "+mult);
		
	}

}
