
public class LinearSearch_EleIn_Array {
	public static void main(String[] args) {
		
int a[]= {10,20,40,50,30};
int search_ele=30;
boolean flag=false;
for (int i = 0; i < a.length; i++) {
	if(search_ele==a[i])
	{	System.out.println("ele is found at the index: "+i);
	flag=true;	
	break;
	}
}
if(flag==false)
System.out.println("Ele not found");
	}
}