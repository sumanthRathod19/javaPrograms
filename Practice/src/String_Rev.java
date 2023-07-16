
public class String_Rev{
	public static void main(String[] args) {
		String nm="Narsimha is a good boy";
		String arr[]=nm.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String ele=arr[i];
			//System.out.println(ele+" ");
			for (int  j=ele.length()-1;j >= 0; j--) {
				System.out.print(ele.charAt(j));
			}
			System.out.print(" ");
		}
	}
}

