
public class SoretedArray {
public static void main(String[] args) {
	MainOperation mo=new MainOperation();
	int a[]=mo.readArray();
	int b[]=mo.readArray();
	System.out.print("user entered 1 st Array: ");
	mo.dispArray(a);
	System.out.println();
	System.out.print("user entered 2 nd  Array: ");
	mo.dispArray(b);
	System.out.println();
	int c[]=mo.sortingArray(a,b);
	System.out.print("Ater Sorting: ");
	mo.dispArray(c);
}
}
