//how many times a specific character is repeating
//and we can count the spaces also
public class CountCharOccurance {

	public static void main(String[] args) {
		String s="Java   programming and oops";
		int tc=s.length();
		int remove=s.replace("a", "").length();
		int count=tc-remove;
		System.out.println(count);
		

	}

}
