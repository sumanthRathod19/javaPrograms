import java.util.Random;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class RandomNum {
int num;

    public static void main(String[] args) {
   Random ran=new Random();
   ran.ints().limit(10).forEach(System.out::println);

    }
}
