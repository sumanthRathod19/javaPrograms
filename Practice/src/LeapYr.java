import java.util.Scanner;
public class LeapYr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the year in the yyyy format only");
	int n=sc.nextInt();
	if(n%400==0 || n%4==0 && n%100!=0)
		System.out.println(n+" is a leap year");
	else
		System.out.println(n+" is not a leap year");

	}

}
