
public class MainFrequency {
public static void main(String[] args) {
	System.out.println("printing frequency numbers: ");
	int []ar= {23,45,56,45,89,45,89,22,45,56};
	printFrequency(ar);
	}

 static void printFrequency(int[] ar) {
	boolean rs[]=new boolean[ar.length];
	for (int i = 0; i < ar.length; i++) {
		if(rs[i]==false) {
			int count=1;
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]==ar[j]) {
					count++;
					rs[j]=true;
				}
			}
			System.out.println(ar[i]+"->"+count);
	}}
}
}
