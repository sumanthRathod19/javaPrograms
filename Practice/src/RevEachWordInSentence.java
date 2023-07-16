
public class RevEachWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str=" Welcome to java ";
str=str.trim();
String[] word=str.split("\\s");
String rev="";
for (String st : word) {
	StringBuilder sb= new StringBuilder(st);
	sb=sb.reverse();
	rev=rev+sb+" ";
}
System.out.println(rev);
	}

}
