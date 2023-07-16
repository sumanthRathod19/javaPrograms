package basics;

import java.util.Scanner;

public class NumberDivisible {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		if(num%3==0 && num%5==0)
		{
			System.out.println("Hi Hello");
		}
		
		else if(num%5==0)
		{
			System.out.println("Hi");
		}
		
		else if(num%3==0)
		{
			System.out.println("Hello");
		}
		
		else
		{
			System.out.println("Bye");
		}
		
	}

}
