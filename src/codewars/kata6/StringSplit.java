package codewars.kata6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplit {
    public static void main(String[] args) {
        String s = "abcdef";
        String s1 = "HelloWorld";
        String s2 = "abcde";
        String s3 = "LovePizza";

        System.out.println(Arrays.toString(solution(s)));
        System.out.println(Arrays.toString(solution(s1)));
        System.out.println(Arrays.toString(solution(s2)));
        System.out.println(Arrays.toString(solution(s3)));
    }

    public static String[] solution(String s) {
        StringBuilder builder = new StringBuilder(s);
        if(s.length() % 2 != 0){
            builder.append("_");
        }
        String newS = builder.toString();
        List<String> stringList = new ArrayList<>();

        for(int i = 0; i < newS.length(); i += 2){
            String tmp = newS.substring(i, i + 2);
            stringList.add(tmp);
        }

        return stringList.toArray(new String[0]);
    }
}
