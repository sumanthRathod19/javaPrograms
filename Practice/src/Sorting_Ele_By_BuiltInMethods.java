import java.util.Arrays;
import java.util.Collections;

public class Sorting_Ele_By_BuiltInMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Approach 1
		int arr[]= {30,50,20,10,60,40};
		//by using sort method
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("---------");
		System.out.println(Arrays.toString(arr));


		//Approach 2
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));
	//Approach to print ele in descending order
		Integer ar[]={30,50,20,10,60,40};
		Arrays.sort(ar, Collections.reverseOrder());
		System.out.println(Arrays.toString(ar));
		
		
	}
}
