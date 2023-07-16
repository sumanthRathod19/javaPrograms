import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=2;

/*for(int i=1;i<=n/2;i++)
	{
	if(n%i==0)
		x++;}
	if(x==1)
		System.out.println("is prime");
		
	
else
	System.out.println("is not prime");  */
boolean x=false;
while(i<=n/2) 
{
	if(n%2==0)
		x=true;
	break;
			}
		
if(!x)
System.out.println(n+" is prime");
else
	System.out.println(n+" is not prime");
}
	}