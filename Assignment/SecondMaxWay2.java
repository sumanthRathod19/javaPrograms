package Assignment;

public class SecondMaxWay2 {
	
	public static void main(String[] args) {
		
		 int[] a= {8,3 ,4,32,2,4,5};
		 
		 int max1=0;
		 int max2=0;
		 
		 for(int i=0; i<a.length; i++)
		 {
			 if(max1<a[i])
			 {
				 max2=max1;
				 max1=a[i];
			 }
			 
			 if(max2<a[i] && a[i]<max1)
			 {
				 max2=a[i];
			 }
		 }
		 
		 System.out.println("1st Maximum: "+max1);
		 System.out.println("2nd Maximum: "+max2);
	}

}
