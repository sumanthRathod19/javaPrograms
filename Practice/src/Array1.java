import java.util.Scanner;

public class Array1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n=sc.nextInt();
	int arr[]=new int [n];
	System.out.println("enter the values:");
	for(int i=0;i<arr.length;i++)
	{
	arr[i]=sc.nextInt();
	}
	//print in forward order
	System.out.print("user enetered values:");
	for(int i = 0;i<arr.length;i++)
	{
	System.out.print(arr[i]+" ");
	
	}
	System.out.println();
	//print in reverse order
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]);
		if(i<arr.length)
			System.out.print(",");
		
	}
}
}
