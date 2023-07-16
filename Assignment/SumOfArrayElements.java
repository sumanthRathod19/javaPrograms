package Assignment;

public class SumOfArrayElements {
	
	public static void main(String[] args) {
		
		int[] a= {2,3,1,5,2};
		int[] b= {1,4,3,2};
		
		int[] c;
		
		if(a.length>=b.length)
		{
			c= new int[a.length];
			
			for(int i=0; i<c.length; i++)  // 0  //1  //2  //3  //4
			{
				if(i<b.length)    // 0<4  //1<4  //2<4  // 3<4  //4<4 x
				{
					c[i]=a[i]+b[i];  // 0-3 // 1-7 // 3-4 // 4-7
				}
				
				else {
					c[i]=a[i];          //5-2 
				}
				
			}
			for(int i=0; i<c.length; i++)
			System.out.print(c[i]+" ");
		}		
	}
}
