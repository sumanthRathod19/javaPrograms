import java.util.Scanner;
public class MainEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number:");
	/*	int a=sc.nextInt();
	//	if(a%2==0)
	//		System.out.println(a+" is even number");
	//	else
	//		System.out.println(a+" is odd number");
		

	//}
i	//with array
	//class EvenOdd{
		
		int n=sc.nextInt();
	
		String st[]= {"even","odd"};
	
		System.out.println(st[n%2]);*/
		//with conditional st from o to n
		int n=sc.nextInt();
		for(int i=2;i<=n;i=i+2)
			System.out.println(i);
	}

}
