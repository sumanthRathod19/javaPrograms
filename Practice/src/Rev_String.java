 
public class Rev_String {
public static void main(String[] args) {
	
	String nm="Sumanth";
//	for (int i=nm.length()-1; i>=0; i--) {
//		System.out.print(nm.charAt(i));
//	}
	
//	StringBuilder sb=new StringBuilder(nm);
//	StringBuilder rev=sb.reverse();
//	System.out.println(rev);
	
//	StringBuffer sb=new StringBuffer(nm);
//	StringBuffer rev=sb.reverse();
//	System.out.println(rev);
	
	//4.using character array
	char [] ch=nm.toCharArray();
	
	for (int i=ch.length-1;i>=0; i--) //3 2 1 0 -1 
	{
		System.out.print(ch[i]); //htnamuS
	}
}
}
