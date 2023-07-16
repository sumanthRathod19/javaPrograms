import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the the number:");
int n=sc.nextInt();//finding factorial 
int res=1;//for storing result
for(int i=n;i>1;i--) {
	res=res*i;

}
System.out.println(res+" factorial's");
	}

}
