package Assignment;

public class SecondMinWithoutSort {
	
	public static void main(String[] args) {
		
        int[] a= {8,3 ,4,32,2,4,5};
		
		int min= a[0];
		int min2=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(min>a[i])
			{
				if(a[i]!=min)
				{
					min2=min;
				}
				min=a[i];
			}
			
			else if(min==min2 || min2>a[i])
			{
				min2=a[i];
			}
		}
		System.out.println("First Minimum is: "+min);
		System.out.println("Second Minimum is: "+min2);
	}

}
