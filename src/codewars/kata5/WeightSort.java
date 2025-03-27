package codewars.kata5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeightSort {
    public static void main(String[] args) {
        String string = "56 65 74 100 99 68 86 180 90";
        System.out.println(orderWeight(string));
    }

    public static String orderWeight(String string) {
        string = string.trim();
        if(string.isEmpty()){
            return string;
        }
        String[] weights = string.split(" +");
        List<WeightedNumber> weightedNumbers = new ArrayList<>();

        for(String weight : weights){
            int digitSum = 0;
            for(int i = 0; i < weight.length(); i++){
                digitSum += weight.charAt(i) - '0';
            }

            WeightedNumber weightedNumber = new WeightedNumber(weight, digitSum);
            weightedNumbers.add(weightedNumber);
        }

        Collections.sort(weightedNumbers);
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < weightedNumbers.size(); i++){
            builder.append(weightedNumbers.get(i).getNumber());
            if(i + 1 < weightedNumbers.size()){
                builder.append(" ");
            }
        }

        return builder.toString();

    }

    static class WeightedNumber implements Comparable<WeightedNumber>{
        private String number;
        private int weight;

        public WeightedNumber(String number, int weight){
            this.number = number;
            this.weight = weight;
        }

        @Override
        public int compareTo(WeightedNumber o) {
            int result = Integer.compare(this.weight, o.weight);
            if(result != 0){
                return result;
            }

            return this.number.compareTo(o.number);
        }

        public String getNumber(){
            return number;
        }
    }
}
