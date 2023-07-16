package java8;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/*
 * input= Hello How are you
 * 
 * output=[Hello-How-are you]
 * 
 */

public class StringJoinerExample {

	public static void main(String[] args) {
		String input="Hello How are you";
		String []inputArray=input.split(" ");
		StringJoiner joiner= new StringJoiner("-", "[", "]");
		for (String inputArr : inputArray) {
			joiner.add(inputArr);
		}
		System.out.println(joiner.toString());
		
		System.out.println();
		
		List<String> inputList=Arrays.asList("Hello","How","are","you");
	String outPut=	inputList.stream().collect(Collectors.joining("-", "[","]"));
		System.out.println(outPut);
		
	}
	
}
