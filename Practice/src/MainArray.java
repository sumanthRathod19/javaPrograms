

public class MainArray {
	
public static void main(String[] args)
{
	MainOperation mo=new MainOperation();
	int x[]=mo.readArray();
	System.out.println("user enterd array");
	mo.dispArray(x);
	int sum=mo.sumOfArray(x);
	System.out.println("sum of the elements: "+sum);
	int big=mo.getBiggest(x);
	System.out.println("Biggest element is: "+big);
	System.out.println("user entered even and odd numbers: ");
	mo.getEvenOdd(x);
	System.out.print("user entered prime numbers are: ");
	mo.getPrime(x);	
	
}
}
