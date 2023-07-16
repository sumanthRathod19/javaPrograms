/**
 * 
 * @author Sumanth
 *
 */


package array;

public class swappingWithThird {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("Before Swapping "+a+" "+b);
		
		// using third variable
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping "+a+" "+b);
		
	}

}
