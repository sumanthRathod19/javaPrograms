import java.util.Scanner;

public class Fibbonacci {
static int fib(int n)
{
	int fn=0;
	if(n<=1)
		return n;
	return fib(n-1)+fib(n-2);
	
}
public static void main(String[] args) {
	

		// TODO Auto-generated method stub
//returning 0 to n no. fib number by recursion method
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  how many fibonnaci numbers to print:");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(fib(i)+" ");
		}
		
	}

}
