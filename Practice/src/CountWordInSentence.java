
public class CountWordInSentence {

	public static void main(String[] args) {
	String s="Welcome to java programming class  ";
	int count=1;
	// s.length()-1 used , if the spaces are after the string it takes the index from the 
	//last word of the letter in a string
	for (int i = 0; i < s.length()-1; i++) {
		if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
			count++;
	}
	System.out.println(count);
	}

}
