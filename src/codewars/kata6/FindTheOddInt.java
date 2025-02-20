package codewars.kata6;

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {
    public static void main(String[] args) {

        int[] a = {7}; // 7
        int[] b = {0}; // 0
        int[] c = {1,1,2}; // 2
        int[] d = {0,1,0,1,0}; // 0
        int[] e = {1,2,2,3,3,3,4,3,3,3,2,2,1}; // 4

        System.out.println(findIt(a));
        System.out.println(findIt(b));
        System.out.println(findIt(c));
        System.out.println(findIt(d));
        System.out.println(findIt(e));

    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for(int number : a){
            numbers.merge(number, 1, Integer::sum);
        }

        int n = 0;

        for(Map.Entry<Integer, Integer> entry : numbers.entrySet()){
            if(entry.getValue() % 2 != 0){
                n = entry.getKey();
                break;
            }
        }

        return n;
    }
}
