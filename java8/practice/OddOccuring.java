//Find the first number occurring odd number of times in an array. (1,2,1,2,4,5,6,6,5,4,2, 4 O/P: 2)


import java.util.HashMap;
import java.util.Map;

public class OddOccuring {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 4, 5, 6, 6, 5, 4, 2, 4};
        int oddNum=firstOddNumber(arr);
        if(oddNum !=-1){
            System.out.println(oddNum);
        }
    }
    public static int firstOddNumber(int []arr){
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num :arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        for (int num:arr) {
            if(freq.get(num)%2!=0){
                return num;
            }
        }
        return -1;
    }

}
