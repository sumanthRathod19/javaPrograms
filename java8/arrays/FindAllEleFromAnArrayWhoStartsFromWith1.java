package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// ex: int [] num= {5,9,11,2,8,21,1}; o/p: 11, 1
public class FindAllEleFromAnArrayWhoStartsFromWith1 {

    public static void main(String[] args) {
        int [] num= {5,9,11,2,8,21,1};
        //To convert a num[] to string []
         List<String> convertofNumArrrayTostringArray = Arrays.stream(num).boxed()
                .map(s -> s + "").collect(Collectors.toList());
        System.out.println(convertofNumArrrayTostringArray); //[5, 9, 11, 2, 8, 21, 1]

        System.out.println();

        //find element from array who starts with1

         List<String> arrayNum = Arrays.stream(num).boxed()
                .map(s -> s + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());
        System.out.println(arrayNum);

    }
}
