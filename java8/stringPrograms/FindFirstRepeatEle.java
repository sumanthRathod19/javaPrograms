package stringPrograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatEle {

    public static void main(String[] args) {
        String str="iamsumanthnaik";
         String firstRepeatEle = Arrays.stream(str.split(""))
                 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() > 1)
                .findFirst().get().getKey();
        System.out.println("First repeat element: "+firstRepeatEle); // First repeat element: i
    }
}
