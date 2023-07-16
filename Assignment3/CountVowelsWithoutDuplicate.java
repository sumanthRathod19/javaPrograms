package Assignment3;

import java.util.LinkedHashSet;

public class CountVowelsWithoutDuplicate {
	
	public static void main(String[] args) {
		
		String str="India";
		String st= str.toLowerCase();
		char[] s= st.toCharArray();
		
		int count= 0;
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		{
			for(int i=0; i<s.length; i++)
			{
				set.add(s[i]);
			}
		}
		
		for(char ch: set)
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
				System.out.println(ch);
			}
			
		}
		
		System.out.println("Total Vowels Without Duplicates are: "+count);
	}

}
