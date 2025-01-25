package codewars.kata6;

import java.util.Arrays;

public class StringArrayDuplicates {
    public static void main(String[] args) {

        String[] array = {"kelless","keenness"};
        System.out.println(Arrays.toString(dup(array)));
        String[] array2 = {"abracadabra","allottee","assessee"};
        System.out.println(Arrays.toString(dup(array2)));

    }

    public static String[] dupUsingLoop(String[] arr){
        String [] dup = new String[arr.length];

        for(int i = 0; i < arr.length; i++){
            StringBuilder builder = new StringBuilder();
            char[] chars = arr[i].toCharArray();
            builder.append(chars[0]);

            for(int j = 1; j < chars.length; j++){
               if(chars[j] != chars[j - 1]){
                   builder.append(chars[j]);
               }

            }

            dup[i] = builder.toString();
        }

        return dup;
    }

    public static String [] dup(String [] arr){
        return Arrays.stream(arr)
                .map(word -> word.chars()
                        .mapToObj(c -> (char) c)
                        .reduce(new StringBuilder(), (sb, c) -> {
                            if(sb.isEmpty() || sb.charAt(sb.length()-1) != c){
                                sb.append(c);
                            }
                            return sb;
                        } ,(sb1, sb2) -> sb1)
                        .toString())
                .toArray(String[] :: new);
    }
}
