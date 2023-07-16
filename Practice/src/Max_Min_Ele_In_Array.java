
public class Max_Min_Ele_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {50,30,40,20,60};
int max=a[0];
for (int i = 0; i < a.length; i++) {
 if(a[i]>max)
	 max=a[i];	 
}
System.out.println(max);
int mini=a[0];
for (int i = 0; i < a.length; i++) {
 if(a[i]<max)
	 mini=a[i];	 
}
System.out.println(mini);
System.out.println("Difference is: "+(max-mini));

System.out.println("----------------------");
//	//by creating method
System.out.println(maxi(a));
System.out.println(mini(a));
System.out.println("Diiference valuee is: "+(maxi(a)-mini(a)));
	
	}

	 static int mini(int[] a) {
		 int min=a[0];
		 for (int i = 0; i < a.length; i++) {
		  if(a[i]<min)
		 	 min=a[i];	 
		 }
		return min;
	}

	static int maxi(int a[]) {
		 int max=a[0];
		 for (int i = 0; i < a.length; i++) {
		  if(a[i]>max)
		 	 max=a[i];	 
		 }
		 return max;
		
	}
}

//Console
//60
//20
//Difference is: 40
//----------------------
//60
//20
//Diiference valuee is: 40
