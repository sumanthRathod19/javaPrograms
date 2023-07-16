import java.util.ArrayList;
import java.util.Scanner;

public class SortedStringWithNumber {
	public void sortSentence(String s) {
		int n = s.length();
		ArrayList<String>li = new ArrayList<>();

		String str = "";
		for(int i=0; i<n; i++){
			if(s.charAt(i)!=' '){
				str+=s.charAt(i);
			}else{
				li.add(str);
				str = "";
			}
		}
		li.add(str);
		// System.out.println(li);//[is2, Sentence4, This1, a3]
		String ans = "";
		int lisize = li.size();
		// System.out.println(lisize);// size=4
		String a[] = new String[lisize];
		for(int i=0; i<li.size(); i++){	

			String x = li.get(i);
			//  System.out.println(x);
			/*   is2
     	   Sentence4
     	   This1
     	   a3	*/
			int y = x.length()-1;
			// System.out.println(y);//2 8 4 1
			//  System.out.println(x.substring(0,y));
			a[x.charAt(y)-'1']= x.substring(0,y);

		}	
		for (String string : a) {
			System.out.print(string+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SortedStringWithNumber sn=new SortedStringWithNumber();
		System.out.println("Enter the sentence with the number: ");
		String str=sc.nextLine();
		sn.sortSentence(str);
	}
}
