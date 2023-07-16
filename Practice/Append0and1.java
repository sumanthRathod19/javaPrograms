package Practice;

public class Append0and1 {
	
	public static void main(String[] args) {
		
		int[] a= {1,0,0,4,3,0,2,0};
		
		int m = 0;
		int n= a.length-1;
		
		int[] temp= new int[a.length];
		
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
