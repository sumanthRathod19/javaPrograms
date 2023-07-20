package java8.stringPrograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheWordsInAStringWithStartsB {
    public static void main(String[] args) {
        String[] str = {"Banna", "Orange", "Mango", "Blackberries", "Blueberries"};

        // Find words that start with the letter "B"
         List<String> wordsStarting = Arrays.stream(str)
                .filter(word -> word.startsWith("B"))
                .collect(Collectors.toList());

        // Print the words starting with "B"
        System.out.println("Words starting with 'B': " + wordsStarting);
    }
}

