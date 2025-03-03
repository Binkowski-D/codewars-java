package codewars.kata6;

import java.util.HashSet;
import java.util.Set;


public class PangramChecker {
    public static void main(String[] args) {

        System.out.println(check("The quick brown fox jumps over the lazy dog"));
        System.out.println(check("This sentence should not be a pangram"));


    }

    public static boolean check(String sentence){
        Set<Character> alphabet = new HashSet<>();

        for(char c : sentence.toLowerCase().toCharArray()){
            if(c >= 'a' && c <= 'z'){
                alphabet.add(c);
            }
        }

        return alphabet.size() == 26;
    }
}
