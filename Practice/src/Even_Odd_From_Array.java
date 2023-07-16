
public class Even_Odd_From_Array {
public static void main(String[] args) {
	
	int arr[]= {2,4,6,7,8};
	
//	System.out.println("Even numbers: ");
//	for (int i = 0; i < arr.length; i++) {
//		if(arr[i]%2==0)
//			System.out.println(arr[i]);
//	}
//	System.out.println("Odd numbers: ");
//	for (int i = 0; i < arr.length; i++) {
//		if(arr[i]%2!=0)
//			System.out.println(arr[i]);
//	}
	
	
		/*
		 * for (int i = 0; i < arr.length; i++) { if(arr[i]%2==0)
		 * System.out.println("Even number: "+arr[i]); else
		 * System.out.println("Odd numbers: "+arr[i]); }
		 */
	//enhanced for looop
	System.out.println("Even numbers: ");
	for (int i : arr) {
		if(i%2==0)
			System.out.println(i);
	}
	System.out.println("Odd numbers: ");
	for (int i : arr) {
		if(i%2!=0)
			System.out.println(i);
		}
	}
}
