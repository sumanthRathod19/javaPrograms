import java.util.Scanner;
public class MainDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the the digit value:");
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		if(d>=-9 && d<=9)
			System.out.println(d+" is digit number");
		else
			System.out.println(d+" is not digit number");

	}

}
