import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n,res = 0,rem=0;
		while(temp!=0) {
			rem=temp%10;
			res +=Math.pow(rem, 3);
			temp /=10;
		}
		
	if(res==n)
		System.out.println(n+" is Amstrong");
	else
		System.out.println(n+" is not Amstrong");		
		
//		int sum=0,temp=n;
//		do {	int i=n%10;
//				int multiply=i*i*i;
//				sum=sum+multiply;
//		}while(n!=0);
//		
//		if(sum==temp)
//			System.out.println(n+" is Amstrong");
//		else
//			System.out.println(n+" is not Amstrong");

		}
	
}
