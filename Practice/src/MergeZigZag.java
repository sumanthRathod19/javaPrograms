public class MergeZigZag {
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
	int []p=mo.zigZag(a,b);
	System.out.print("After zigZag: ");
	mo.dispArray(p);
	}
}
