package codewars.kata6;

import java.util.Set;

public class AreWeAlternate {
    public static void main(String[] args) {

        System.out.println(isAlt("amazon")); // true
        System.out.println(isAlt("apple")); // false
        System.out.println(isAlt("banana")); // true
        System.out.println(isAlt("aron")); // true
        System.out.println(isAlt("aset")); // true
        System.out.println(isAlt("c")); // false
        System.out.println(isAlt("uwoaljzou"));

    }

    public static boolean isAlt(String word) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        word = word.toLowerCase();

        boolean isVowel = vowels.contains(word.charAt(0));

        for(int i = 1; i < word.length(); i++){
            boolean currentIsVowel = vowels.contains(word.charAt(i));

            if(isVowel == currentIsVowel){
                return false;
            }

            isVowel = currentIsVowel;
        }

        return true;
    }
}
