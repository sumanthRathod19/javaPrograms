import java.util.Scanner;

public class MainOperation 
{

	int[] readArray() {
		System.out.println("Enter the size of the array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the "+n+" no. of the elements");
		int arr[]=new int [n];
		for (int i = 0; i < arr.length; i++) {

			arr[i]=sc.nextInt();
		}
		return arr;
	}

	void dispArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	int sum=0;
	public int sumOfArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			sum =sum+arr[i];
		}
		return sum;
	}

	public int getBiggest(int[] arr) {
		int big=arr[0];
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]>big)
				big=arr[j];
		}
		return big;
	}

	public void getEvenOdd(int[] arr) {
		System.out.print("even numbers are: ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		}System.out.println();
		System.out.print("Odd nubers are: ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0)
				System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public  void getPrime(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean isPrime=true; 
			for (int j = 2; j<arr[i]; j++) {
				if(arr[i]%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.print(arr[i] +" ");
		}	System.out.println();
	}

//zigZag of two Arrays
	/*	public int[] zigZag1(int[] x, int[] y) {
		int z[] = new int[x.length+y.length];
		
		int i=0,j=0;
		while(i<x.length&&i<y.length) {
			z[j++]=x[i];
			z[j++]=y[i++];
		}
		while(i<x.length) {
			z[j++]=x[i++];
		}
		while(i<y.length) {
			z[j++]=y[i++];
		}
	return z;
	}*/



	public int[] zigZag(int[] a, int[] b) {
		int c[]=new int[a.length+b.length];
		int i=0,j=0;
		while(i<a.length&&i<b.length)
		{
			c[j++]=a[i];
			c[j++]=b[i++];
		}
	while(i<a.length) {	
		c[j++]=a[i++];
	}
	while(i<b.length) {
		c[j++]=b[i++];
	}
		return c;
	}
	//merging arrays
	
	public int[] mergeArray(int[]x,int[]y) {
	int z[]=new int[x.length+y.length];
	for (int i = 0; i < x.length; i++) {
		z[i]=x[i];
		}
		for (int i = 0; i < y.length; i++) {
			z[x.length+i]=y[i];
		}
	return z;
	}

	public int[] sortingArray(int[] x, int[] y) {
		int z[]=new int[x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length&&j<y.length) {
			if(x[i]<y[j])
				z[k++]=x[i++];
			else
				z[k++]=y[j++];
		}
		while(i<x.length) {
			z[k++]=x[i++];
		}
		while(j<y.length) {
			z[k++]=y[j++];
		}
		return z;
	}
//fetching duplicate elements in an array
	public int[] dupilcateArray(int[] x, int[] y) {
		int z[]=new int[x.length+y.length];
		int k=0;
		int[] rs=new int[x.length];int res[]=new int[k];
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<y.length;j++) {
			
			if(x[i]==y[j])
				rs[k++]=x[i];
			break;
			}
			for (int j = 0; j < res.length; j++) {
				res[i]=rs[j];
			}
		}
		return rs;
	}
}
