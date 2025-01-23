package codewars.kata6;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static void main(String[] args) {

        System.out.println(duplicateCountSecondOption("aA11"));
    }

    public static int duplicateCount(String text) {
        String lower = text.toLowerCase();
        char[] chars = lower.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char tmp : chars){
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }

        int result = 0;

       for(Map.Entry<Character, Integer> tmp : map.entrySet()){
           if(tmp.getValue() > 1){
               result ++;
           }
       }
        return result;
    }

    public static int duplicateCountSecondOption(String text){

        return (int) text.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .filter(count -> count > 1)
                .count();
    }
}
