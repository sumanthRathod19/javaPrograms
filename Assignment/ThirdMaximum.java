package Assignment;

public class ThirdMaximum {
	
	public static void main(String[] args) {
		
		int[] a= {4,8,1,3,2,5};
		
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
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
		System.out.println("3rd Largest is: "+a[2]);
		
	}

}
