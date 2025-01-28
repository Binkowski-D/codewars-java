package codewars.kata6;

public class Kata {

    public static void main(String[] args) {

        char[] chars = {'a','b','c','d','f'};
        char[] array = {'O','Q','R','S'};
        System.out.println(findMissingLetter(chars));
        System.out.println(findMissingLetter(array));

    }

    public static char findMissingLetter(char[] array) {
        for(int i = 1; i < array.length; i++){
            if(array[i] - array[i - 1] != 1){
                return (char)(array[i - 1] + 1);
            }
        }
        throw new IllegalArgumentException("No missing letter found");
    }
}

