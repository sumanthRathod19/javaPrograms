package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


// int []num={5,9,11,2,8,21,1}; o/p: 11
public class FindHighestAndLowestNumFromGivenArray {

    public static void main(String[] args) {
        int[] num = {5, 9, 11, 2, 8, 21, 1};
        //to print in ascending order
         List<Integer> integerAscending = Arrays.stream(num).boxed().sorted()
                 .collect(Collectors.toList());
        System.out.println(integerAscending);// [1, 2, 5, 8, 9, 11, 21]

        // to print in the descending order
        List<Integer> integerDescending = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(integerDescending); //[21, 11, 9, 8, 5, 2, 1]


        // to find the 2 nd hihgest num

        Integer secondHighestNum = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder())
                        .skip(1).findFirst().get();
        System.out.println(secondHighestNum); //11

        // to find the 2 nd hihgest num

        Integer secondLowestNum = Arrays.stream(num).boxed().sorted()
                .skip(1).findFirst().get();
        System.out.println(secondLowestNum); //2

    }
}
