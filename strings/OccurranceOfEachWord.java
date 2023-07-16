package strings;

import java.util.LinkedHashSet;

public class OccurranceOfEachWord {
	
	public static void main(String[] args) {
		
		String str= "I Love Love I Bangalore City";
		String[] s = str.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		for(int i=0; i<s.length; i++)
		{
			set.add(s[i]);
		}
		
		for(String str1: set)
		{
			int count =0;
			for(int i=0; i<s.length; i++)
			{
				if(str1.equals(s[i]))
				{
					count++;
				}
			}
			
			System.out.println(str1+" is repeated "+count+" times");
		}
	}

}
