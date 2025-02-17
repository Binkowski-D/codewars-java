package codewars.kata5;

import java.util.HashMap;
import java.util.Map;

public class GreedIsGood {
    public static void main(String[] args) {

        int[] dice = {5,1,3,4,1};
        System.out.println(greedy(dice));

    }

    public static int greedy(int[] dice){
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : dice){
            map.merge(number, 1, Integer :: sum);
        }

        int sum = 0;

        int[] tripleScores = {0, 1000, 200, 300, 400, 500, 600};

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int number = entry.getKey();
            int count = entry.getValue();

            if(count >= 3){
                sum+= tripleScores[number];
                count-= 3;
            }

            if(number == 1){
                sum+= count * 100;
            }else if(number == 5){
                sum+= count * 50;
            }

        }

        return sum;
    }
}
