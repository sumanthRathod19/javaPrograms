
public class Check_Prime_Num {
public static void main(String[] args) {
	
	int n=15;
	int count = 0;
	if(n>1) {
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println(n+" is Prime number");
		else
			System.out.println(n+" is not prime number");
	}
	else
		System.out.println("Not prime number");
	}
}