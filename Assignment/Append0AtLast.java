package Assignment;

public class Append0AtLast {
	
	public static void main(String[] args) {
		
		int[] a= {2,0,1,3,0,0};
		
		int m= 0;
		int n= a.length-1;
		
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
				temp[n]=a[i];
				n--;
			}
		}
		
		for(int j=0; j<temp.length; j++)
		{
			System.out.print(temp[j]+" ");
		}
		
	}

}
