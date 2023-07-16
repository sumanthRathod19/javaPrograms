import java.util.Arrays;

public class Find_Missing_Num_array {
	public static void main(String[] args) {
		//shoukd not have dupilcates
		//array no need to be sorted order
		//values should be proper range

		//sorting an array

		int a[]= {1,2,4,5};
		Arrays.sort(a); 
		for (int i = 0; i < a.length; i++) { 
			System.out.print(a[i]+" ");//1 3 4 5 7 8 // 
		} 
		// sum of array ele
		System.out.println();
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum=sum+a[i]; } 
		System.out.println("Sum of the Numbers: "+sum);

		//find the missed ele in array
		int sum1=0; 
		for (int i = 0; i <=5; i++) 
		{ 
			sum1= sum1+i; 
		}
		System.out.println("missing number is "+(sum1-sum));

		/*
		 * // finding more missed numbers in an array // Function to find the missing
		 * elements
		 * 
		 * // Given array arr[] int arr[] = { 6, 7, 10, 11, 13 }; int N=arr.length;
		 * 
		 * // Function call printMissingElements(arr, N);
		 */
	}

	/*
	 * static void printMissingElements(int arr[], int N) {
	 * 
	 * // Initialize an array with zero // of size equals to the maximum // element
	 * in the array int[] b = new int[arr[N - 1] + 1];
	 * 
	 * // Make b[i]=1 if i is present // in the array for(int i = 0; i < N; i++) {
	 * 
	 * // If the element is present // make b[arr[i]]=1 b[arr[i]] = 1; }
	 * 
	 * // Print the indices where b[i]=0 for(int i = arr[0]; i <= arr[N - 1]; i++) {
	 * if (b[i] == 0) { System.out.print(i + " "); } } }
	 */
}