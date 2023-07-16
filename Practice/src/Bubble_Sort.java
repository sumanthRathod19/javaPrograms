import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		int[] arr= {4,2,1,5,3};
		int len = arr.length;
		//bubble sort logic
		for(int i=0; i<len-1;i++) // for number of passes
		{
			for (int j = 0; j < len-i-1; j++) // iteration for each passes
			{
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//lets print array
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
