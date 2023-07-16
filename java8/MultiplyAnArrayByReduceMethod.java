package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultiplyAnArrayByReduceMethod {
	
	public static void main(String[] args) {
		
	Integer[]inputArray= {1,2,3,4,5};
	List<Integer> numberList=Arrays.asList(inputArray);
	
	Optional<Integer> outPut=numberList.stream().reduce((a,b)-> a*b);
	
	if(outPut.isPresent()) {
		System.out.println("Arrays multiplication using java8: "+outPut.get());
		
	}else
		System.out.println("Empty Array List ");
	
	if(outPut.isPresent()) {
	Integer foreachoutput =1;
	for(Integer num : numberList)
	foreachoutput *=num;
	
	System.out.println("Arrays multiplication using foreach: "+foreachoutput);
	} 
	else
		System.out.println("Empty Array List ");
	}
}
	

