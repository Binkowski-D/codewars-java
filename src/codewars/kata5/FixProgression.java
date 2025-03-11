package codewars.kata5;

import java.util.*;

public class FixProgression {
    public static void main(String[] args) {

        System.out.println(neededSwaps(new int[]{1, 2, 3})); // 0
        System.out.println(neededSwaps(new int[]{1, 3, 0, 7, 9})); // 1
        System.out.println(neededSwaps(new int[]{1, 10, 2, 12, 3, 14, 4, 16, 5})); // 5
        System.out.println(neededSwaps(new int[]{7, 7, 7, 7, 8, 7, 7, 7, 7, 7, 7, 7, 7, 7, 9, 7, 7, 7, 7, 7, 7})); // 2
        System.out.println(neededSwaps(new int[]{2, -1, -4, 12, 1, -13, -16, -19, -6, -25})); // 3
        System.out.println(neededSwaps(new int[]{-1, 2, 5, 8, 11, 14, 17, -6, 23, 26, -25, 32})); // 2

    }

    public static int neededSwaps(int[] arr) {
        Set<Integer> differences = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if((arr[j] - arr[i]) % (j - i) == 0){
                    int difference = (arr[j] - arr[i]) / (j - i);
                    differences.add(difference);
                }
            }
        }

        int changes = Integer.MAX_VALUE;

        for(int startIndex = 0; startIndex < arr.length; startIndex ++){
            for(Integer d : differences){
                int tmpChanges = 0;
                int start = arr[startIndex];

                for(int i = 0; i < arr.length; i++){
                    int expectedValue = start + ((i - startIndex) * d);
                    if(arr[i] != expectedValue){
                        tmpChanges ++;
                    }
                }

                changes = Math.min(changes, tmpChanges);
            }
        }


        return changes;
    }
}
