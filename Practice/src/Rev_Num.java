
public class Rev_Num {
	
public static void main(String[] args) {
	int num=12345;
	//int rev = 0;
	// using algorithm
//	while (num!=0) {
//		rev=rev*10+num%10; //0+1234%10=4 40+3=43 430+2=432 4320+1=4321
//		num=num/10; // 1234/10=123 12/10=3 1/10=0
//	}
//	System.out.println(rev);
	
	String n=String.valueOf(num);
//StringBuffer sb=new StringBuffer(n);
//StringBuffer rev=sb.reverse();
//System.out.println(rev);
	
	StringBuilder sb=new StringBuilder(n);
	StringBuilder rev=sb.reverse();
	System.out.println(rev);
}
}