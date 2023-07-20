package array;

import java.util.HashSet;

public class FindMissingNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 8, 7, 9, 6};

        // Find the maximum number in the array
        int maxNumber = 0;
        for (int num : arr) {
            if (num > maxNumber) {
                maxNumber = num;
            }
        }
        System.out.println(maxNumber);// 9

        // Create a HashSet containing all possible numbers from 1 to maxNumber
        HashSet<Integer> allNumbers = new HashSet<>();
        for (int i = 1; i <= maxNumber; i++) {
            allNumbers.add(i);
        }
        System.out.println(allNumbers); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        // Remove each element from the set as you encounter it in the array
        for (int num : arr) {
            allNumbers.remove(num);
        }

        // The set will now contain the missing numbers
        System.out.println("Missing numbers: " + allNumbers); // Missing numbers: [4]
    }
}
