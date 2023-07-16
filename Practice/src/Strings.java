import java.util.Scanner;
public class Strings
{
	public static void main(String[] args) {
		//reverse  of the string in 2 ways 
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1st name");
		String FirstName=sc.nextLine();
		String LastName=FirstName;
		String Fn=FirstName+"  "+LastName;
		System.out.println(Fn);
		//1st way to rev the string
		char a[]=Fn.toCharArray();
		String Rev="";
		for(int i=a.length-1;i>=0;i--)
		{	
			int len=a.length;
			Rev=Rev+a[i];
		}
		System.out.println(Rev);
		//2nd way to rev the string
		String Rev1="";

		for(int i=Fn.length()-1;i>=0;i--)
		{
			Rev1=Rev+Fn.charAt(i);
		}
		System.out.print("Rev1:"+Rev1);
		System.out.println();


		System.out.println(Fn);
		//to get length of the string
		System.out.println(Fn.length());
		//to compare the strings
		System.out.println(FirstName.compareTo(LastName));
		//compares the address
		System.out.println(FirstName==LastName);
		//compares the content
		System.out.println(FirstName.equals(LastName));
		//sentence to upper case
		Fn=Fn.toUpperCase();
		System.out.println(Fn);
		//sentence to lower case
		String	fn=Fn.toLowerCase();
		System.out.println(fn);
		//use of substring
		fn=fn.substring(0, 5);
		System.out.println(fn);
		//Exception occurred because of index out of the range
		try {
			fn=fn.substring(0, 18);
			System.out.println(fn);
		}catch(StringIndexOutOfBoundsException se)
		{
			System.out.println("StringIndexOutOfBoundsException");
			se.printStackTrace();
			
		}



	}


}
