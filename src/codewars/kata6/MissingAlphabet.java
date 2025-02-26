package codewars.kata6;

import java.util.HashSet;
import java.util.Set;

public class MissingAlphabet {
    public static void main(String[] args) {

        System.out.println(insertMissingLetters("holly"));

    }

    public static String insertMissingLetters(String str) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder builder = new StringBuilder();
        Set<Character> processedLetters = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);
            if(processedLetters.contains(letter)){
                builder.append(letter);
                continue;
            }

            builder.append(letter);
            int index = letters.indexOf(letter);

            for(int j = index + 1; j < letters.length(); j++){
                if(!str.contains(String.valueOf(letters.charAt(j)))){
                    builder.append(Character.toUpperCase(letters.charAt(j)));
                }
            }

            processedLetters.add(letter);
        }

        return builder.toString();
    }
}

