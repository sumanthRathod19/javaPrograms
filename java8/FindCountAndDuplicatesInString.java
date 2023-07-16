package java8;

import java.util.Map;
import java.util.stream.Collectors;

/*
 * Using Streams
 * Find the vowels count in the string
 * Find the duplicates and count in the spring
 */

public class FindCountAndDuplicatesInString {

	public static void main(String[] args) {

		String input="hello hello";
		long count=	input.chars().filter(x -> {
			return(x=='a' || x=='e' 
					|| x=='i' || x=='o' || x=='u');
		}
				).count();
		System.out.println("No. of vowels: "+count);

		Map<Object, Long> out = input.chars().mapToObj(x -> (char)x)
				.collect(Collectors.groupingBy(x -> x, 
						Collectors.counting()));
			
		out.forEach((key, value) ->{
				if(value>1)
					System.out.println(key+": "+value);
				}
			);
	}

}
