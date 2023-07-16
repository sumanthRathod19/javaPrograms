import java.util.HashSet;

public class Duplicates_Ele_In_array {
	public static void main(String[] args) {
		int a[]= {20,50,80,70,20,10,30};
		int dupli=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]==dupli)
				dupli=a[i];
		}
		System.out.println(dupli);
		System.out.println("--------------");

		//Approach 1
		String arr[]= {"java","c","python","c++","java"};
		String duplicate=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==duplicate)
			{duplicate=arr[i];
			}

		}
		System.out.println(duplicate);
		System.out.println("-------------");
		//approach 2
		String ar[]= {"c++","java","c","python","c++","java"};
		HashSet<String> hs=new HashSet();
		boolean flag=false;
		for (String l : ar) {
			if(hs.add(l)==false)
			{
				System.out.println("Duplicate ele is: "+l);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("NO duplicates ");
	}
}

//console
//20
//--------------
//java
//-------------
//Duplicate ele is: c++
//Duplicate ele is: java
