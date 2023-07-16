
public class SumOf_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={5,2,7,9,6};
int sum = 0;
		/*
		 * for (int i = 0; i <arr.length; i++) { sum=sum+arr[i]; }
		 */
for (int i : arr) {
	sum=sum+i;
}
System.out.println(sum);
	}

}
