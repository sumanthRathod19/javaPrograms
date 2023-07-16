
public class StringProg {
public static void main(String[] args) {
	

	String str1=new String("Rajareddy");
	String str=new String("Rajareddy");
	System.out.println(str==str1);//false
	String str2="Raja".concat("reddy");
	System.out.println("--------String-----");
	System.out.println(str1==str2);//false  ->compares the reff/address
	System.out.println(str==str1);//true 
	System.out.println(str.hashCode()==str1.hashCode());//true		->compares the hashcode 
	System.out.println(str2.hashCode()==str1.hashCode());//true
	System.out.println(str2.hashCode()+"  "+str1.hashCode());
	System.out.println(str1.equals(str2));	//true ->compares the content
	System.out.println(str.equals(str2));	//true 
	System.out.println("--------String-----");
	
	
	String s1=new String("raja");
	String s2=new String("raja");
	System.out.println(s1==s2);//false
	System.out.println(s1.equals(s2));//false
	System.out.println("--------StringBuilder-------");
	StringBuilder sb=new StringBuilder(str);
	StringBuilder sb1=new StringBuilder(str);
	System.out.println(sb==sb1);	//false
	System.out.println(sb.equals(sb1));	//false
	System.out.println(sb.hashCode()+"  "+sb1.hashCode()); //false
	System.out.println("--------StringBuilder--------");
	String st="abc";
	String st1="abc";
	StringBuilder sbb=new StringBuilder(str);
	sbb.append("efg");
	StringBuilder sb11=sbb;
	System.out.println(st.contentEquals(st1));//true
	System.out.println(sbb.equals(sb11));//true
	System.out.println(sbb.hashCode()==sb11.hashCode());//true
	System.out.println("-------Arthimetic----");
	System.out.println(0);//0
	//System.out.println(1/0);  //ArithmeticException
	System.out.println(0.0/1.0);//0.0
	System.out.println(0.0/1.0);//0.0
	byte a=1;
	byte b=2;
	int c=a+b;
//	byte c1=a+b;		//compile time error
	System.out.println(c);   //3
	
	
	
}
}
