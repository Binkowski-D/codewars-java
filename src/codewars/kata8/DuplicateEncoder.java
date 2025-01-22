package codewars.kata8;

import java.util.HashMap;

public class DuplicateEncoder {
    public static void main(String[] args) {

        System.out.println(encode("din"));
        System.out.println(encode("recede"));
        System.out.println(encode("Success"));
        System.out.println(encode("(( @"));

    }

    public static String encode (String word) {
        HashMap<Character, Integer> chars = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        String lower = word.toLowerCase();

        for(char tmp : lower.toCharArray()){
            chars.put(tmp, chars.getOrDefault(tmp, 0) + 1);
        }

        for(int i = 0; i < lower.length(); i++){
            if(chars.get(lower.charAt(i)) > 1){
                builder.append(')');
            }else{
                builder.append('(');
            }
        }

        return builder.toString();
    }
}
