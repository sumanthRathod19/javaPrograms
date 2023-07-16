import java.util.Arrays;

//to do binary search algo the ele should be in the sorted order
public class Binary_Search {

	public static void main(String[] args) {
		// ele should be in sorted order
		int a[]= {1,2,3,4,5,6,7,8,9,10};
//		int key=11;
//		int l=0;
//		int  h=a.length-1;
//		boolean flag=false;
//		while(l<=h) {
//			int m=(l+h)/2;
//			if(a[m]==key) {
//				System.out.println("Element found at the index: "+m 
//					+" and the value is: "+a[m]);
//				 flag = true;
//				break;
//			}
//			if(a[m]<key)
//				l=m+1;
//			if(a[m]>key)
//				h=m-1;
//		}
//		if(flag==false)
//			System.out.println("No ele found..");
	
		//approach 2 Arrays.binarySearch()
		
	System.out.println("Ele at the index is: "+Arrays.binarySearch(a, 8));
		
		
	
	}

}
