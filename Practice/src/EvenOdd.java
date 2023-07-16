import java.util.Scanner;
public class EvenOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	//by using if and else
	/*if(n%2==0)
		System.out.println(n+" is even");
	else
		System.out.println(n+" is odd");
	*/
	//by using array
	String st[]= {"Even","Odd"};
	System.out.println("entered number is "+st[n%2]);
	
}
}
