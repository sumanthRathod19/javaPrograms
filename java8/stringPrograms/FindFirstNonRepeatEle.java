package stringPrograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// isumanthnaik  o/p : s
// ilovejavatechie o/p: l
public class FindFirstNonRepeatEle {

    public static void main(String[] args) {
        String str="isumanthnaik";

         String firstNonRepeatEle = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println("First non repeat element: "+firstNonRepeatEle);// First non repeat element: s

        String str1="ilovejavatechie";

        // actually internally the hashmap doesnt follow insertion order so it gives o/p : c the actual o/p : l
        // BY using LinkedHashMap::new we will tell the stream dont follow this way and we will get o/p: l
        // the o/p should be l

        String firstNonRepeatElement = Arrays.stream(str1.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println("First non repeat element: "+firstNonRepeatElement); //First non repeat element: l

    }
}
