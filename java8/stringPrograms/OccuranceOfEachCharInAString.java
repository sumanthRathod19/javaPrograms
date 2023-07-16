package stringPrograms;

import sun.security.pkcs11.wrapper.Functions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//ex: sumanthnaik ---> o/p:  s-1 u-1 m-1 a-2 n-2 t-1 h-1 i-1 k-1
public class OccuranceOfEachCharInAString {

    public static void main(String[] args) {
        String str="sumanthnaik";
    // String res[]=  str.split("");
       // System.out.println(Arrays.toString(res));//[s, u, m, a, n, t, h, n, a, i, k]
      Map<String, Long> map= Arrays.stream(str.split("")).collect(Collectors
              .groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map); //{a=2, s=1, t=1, u=1, h=1, i=1, k=1, m=1, n=2}
    }

}
