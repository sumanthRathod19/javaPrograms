import java.util.Scanner;
public class MainReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();

		for(int i=0;i<ch.length-1;i++)
		{
			char t=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=t;
		}
		st=new String(ch);
		System.out.println("Reversed String: "+st);
	}
}
