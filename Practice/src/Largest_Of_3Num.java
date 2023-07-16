
public class Largest_Of_3Num {
public static void main(String[] args) {
	
	int a=20,b=10,c=30;
//	int big=a;
//	if(b>big)
//		big=b;
//	if(c>big)
//		big=c;
//	System.out.println(big);
	
	if(a>b && a>c)
		System.out.println(a);
	else if(b>a && b>c)
		System.out.println(b);
	else
		System.out.println(c);
	
		//by using terinary operator
//int	big=a>b?a:b; //here the largest one wil be stored in the big
//big=big>c?big:c;
//System.out.println(big);

int big=(a>b?a:b)>c?(a>b?a:b):c;
System.out.println(big);

}
}
