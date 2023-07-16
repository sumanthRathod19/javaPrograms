
public class Sqr_Root_Num {


public static void main(String[] args) {
//	int n=245; //to find the square of the number
//	 long sqr=n*n;
//	 
//	System.out.println(sqr);
	
	//to find the square root of the number
	int n=64;
	
	//System.out.println(Math.sqrt(n));
	System.out.println();
	System.out.println("Square root of n is "+squareRoot(n));
	
}
public static double squareRoot(int n)   
{  
//temporary variable  
double t;  
double sqrtroot=n/2;  
System.out.println(sqrtroot);//32
do   
{  
t=sqrtroot;  
System.out.println(t);//32
sqrtroot=(t+(n/t))/2;  
System.out.println(sqrtroot);//17
}   
while((t-sqrtroot)!= 0);  

return sqrtroot;
}  
}
