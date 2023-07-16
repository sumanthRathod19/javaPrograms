package arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

// String str[] = {"java","techie","springboot","microservices"};
// find the longest string in given array o/p: microsevices
public class FindLongestAndShoertestStringFromGivenArray {

    public static void main(String[] args) {
        String str[] = {"java","techie","springboot","microservices","dockerk8sawsamazonwebservices"};

        //to find the longest string
         String findTheLogestString = Arrays.stream(str)
                 .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(findTheLogestString); //dockerk8sawsamazonwebservices

        //to find the shortest string in an array

        String findTheShortestString = Arrays.stream(str)
                .reduce((word1, word2) -> word1.length() < word2.length() ? word1 : word2)
                .get();
        System.out.println(findTheShortestString); //java

    }

}
