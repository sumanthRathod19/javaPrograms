import java.util.Scanner;

public class MainPrime {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
int c=0;
for(int i=1;i<=n/2;i++)
{
	if(n%i==0)
		c++;
}
if(c==1)
	System.out.println(n+" is prime");
else
	System.out.println(n+" is not prime");
}
}
