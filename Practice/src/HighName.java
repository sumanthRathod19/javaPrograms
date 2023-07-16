
import java.util.Scanner;

public class HighName {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the array size:");
	int n=sc.nextInt();
	String nm[]=new String[n];
	int big=0;
	String Big="";
	System.out.println("enter the "+n+" no.of names ");
	for(int i=0;i<n;i++) {
		nm[i]=sc.next();
		if(nm[i].length()>big)
			Big=nm[i];
			
	}
	System.out.println();
}
}
