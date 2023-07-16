package java8;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReUsingStream {
	
/*
 * can we reuse the stream ??
 * answer: we can reuse the stream any no. of times by using supplier FI
 * 
 */

	public static void main(String[] args) {
		
		
	String []inputArray= {"Amit","ball","call","egg","Amit"};
//		Stream<String> inputStream=Arrays.asList(inputArray).stream();
//		inputStream.forEach(ex->System.out.println(ex));
//		long count = inputStream.filter(x->"Amit".equals(x)).count();
//		System.out.println(count);
		Supplier<Stream<String>> inputStream= ()-> Stream.of(inputArray);
		
		inputStream.get().forEach(ex->System.out.println(ex));
		
		long count = inputStream.get().filter(x->"Amit".equals(x)).count();
		System.out.println(count);
		
		long count1 = inputStream.get().filter(x->"egg".equals(x)).count();
		System.out.println(count1);
		
	}

}
