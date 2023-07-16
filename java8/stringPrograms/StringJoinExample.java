package stringPrograms;

import java.util.Arrays;
import java.util.List;

//
public class StringJoinExample {

    public static void main(String[] args) {
     List<String> arrayOfString=   Arrays.asList("1", "2", "3", "4");
        // 1-2-3-4
         String result = String.join(",,", arrayOfString);
        System.out.println(result);
    }
}
