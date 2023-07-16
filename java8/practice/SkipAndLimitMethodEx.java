import java.util.stream.IntStream;

//if we have 1-10 numbers and want to skip 1 and 1 0 and want to print 2-9
public class SkipAndLimitMethodEx {

    public static void main(String[] args) {
        IntStream.rangeClosed(1,10)
                .skip(1).limit(8).forEach(System.out::println);
   }
}
