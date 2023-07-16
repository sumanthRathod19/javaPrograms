
public class Count_SumOf_Num {
public static void main(String[] args) {
	
	int num=123456789;
	int n =0;
	while(num>0) {
	n=n+num%10;	
	num=num/10;
	}
	System.out.println("Sum of  digits in a number: "+n);
}
}
