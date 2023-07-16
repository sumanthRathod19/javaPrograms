package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesInString {

	public static void main(String[] args) {
		
        String str= "tester";
		
		Set<Character> set = new LinkedHashSet<>();
		
		for( int i=0; i<str.length(); i++)
		{
			set.add(str.charAt(i));
		}
		
		for(Character ch: set)
		{
			int count=0;
			
			for(int i=0; i<str.length(); i++)
			{
				
				if(ch==str.charAt(i))
				{
					count++;
				}
				
			}
			
			if(count>=2)
			{
				System.out.println(ch+" occured "+count+" times");
			}
		}
	}
}
