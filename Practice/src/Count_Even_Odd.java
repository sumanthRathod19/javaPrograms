
public class Count_Even_Odd {


public static void main(String[] args) {
	int num=7312;
	int counteven=0;
	int countodd=0;
	System.out.println("hello");
	while(num!=0) {
		 int n = num%10;
		 if(n%2==0)
		counteven++;
		 else
		  countodd++;
		 num=num/10;
		 }
	System.out.println("Number of even numbers are: "+counteven);	
	System.out.println("Number of odd numbers are: "+countodd);

}

}
