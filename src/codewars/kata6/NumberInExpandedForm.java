package codewars.kata6;

import java.util.LinkedList;
import java.util.List;

public class NumberInExpandedForm {

    public static void main(String[] args) {

        System.out.println(expandedForm(70304));
    }

    public static String expandedForm(int num)
    {
        List<Integer> numbers = new LinkedList<>();
        int multiplier = 1;

        while(num != 0){
            int digitValue = num % 10 * multiplier;
            if(digitValue != 0){
                numbers.add(0, digitValue);
            }

            multiplier *= 10;
            num /= 10;
        }

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < numbers.size(); i++){
            builder.append(numbers.get(i));
            if(i < numbers.size() - 1){
                builder.append(" + ");
            }
        }

        return builder.toString();
    }
}
