package java8.practice;

public class EvenOddWithOutModulus {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

       /*
       IntStream.of(arr): This creates an IntStream from the array arr. An IntStream is a stream of primitive int values.
        filter(num -> (num & 1) == 0): The filter method takes a lambda expression as an argument. In this lambda expression, we use the bitwise AND operation num & 1 to check if the least significant bit (LSB) of the number is 0. If the LSB is 0, it means the number is even. Therefore, the filter keeps only the even numbers in the stream.
        forEach(System.out::print): The forEach method takes a consumer as an argument, which is the method reference System.out::print. It iterates through each element in the stream and calls System.out.print on each element, effectively printing the even numbers.
*/
        System.out.println("Even numbers:");
        for (int num : arr) {
            if ((num & 1) == 0) { // Check if the LSB(least significant bit) is 0 (even number)
                System.out.print(num + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        for (int num : arr) {
            if ((num & 1) == 1) { // Check if the LSB is 1 (odd number)
                System.out.print(num + " ");
            }
        }
    }
}

