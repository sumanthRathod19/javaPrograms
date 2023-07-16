
public class Palindrome_String {
	public static void main(String[] args) {
		
	
String nm="level";
String org_nm=nm;
String rev="";
for (int  i =nm.length()-1;i >= 0; i--) {
	rev=rev+nm.charAt(i);
}
if(org_nm.equals(rev))
	System.out.println("String is Palimdrome: "+rev);
else
	System.out.println("String is not Palimdrome");
	}
}