package codewars.kata5;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        System.out.println(firstNonRepeatingLetter("a"));         // expected: "a"
        System.out.println(firstNonRepeatingLetter("streSS"));    // expected: "t"
        System.out.println(firstNonRepeatingLetter("moon-men"));  // expected: "-"
        System.out.println(firstNonRepeatingLetter("moonmoon"));  // expected: ""
    }


    public static String firstNonRepeatingLetter(String s){
        String result = "";
        Map<Character, Integer> repeats = new LinkedHashMap<>();
        for(int i = 0; i < s.toLowerCase().length(); i++){
            repeats.merge(s.toLowerCase().charAt(i), 1, Integer ::sum);
        }

        for(Map.Entry<Character, Integer> entry : repeats.entrySet()){
            char sign = entry.getKey();
            int v = entry.getValue();
            if(v == 1){
                for(int i = 0; i < s.length(); i++){
                    if(sign == s.toLowerCase().charAt(i)){
                        result = String.valueOf(s.charAt(i));
                        break;
                    }
                }

                break;
            }
        }
        return result;
    }
}
