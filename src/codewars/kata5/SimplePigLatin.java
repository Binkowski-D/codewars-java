package codewars.kata5;

import java.util.Arrays;
import java.util.stream.Collectors;


public class SimplePigLatin {
    public static void main(String[] args) {

        System.out.println(pigIt("This is my string"));
    }

    public static String pigIt(String str) {
       String [] words = str.split("\\s+");

       return Arrays.stream(words)
               .map(word -> {
                    if(Character.isLetter(word.charAt(0))){
                        if(!word.matches(".*[.,:;!?]$")){
                            word = word.substring(1) + word.charAt(0) + "ay";
                        }else{
                            word = word.substring(1, word.length() - 1) + word.charAt(0) + "ay" + word.charAt(word.length() - 1);
                        }
                    }
                    return word;
               })
               .collect(Collectors.joining(" "));
    }
}
