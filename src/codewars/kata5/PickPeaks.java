package codewars.kata5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {
    public static void main(String[] args) {
        int [] arr = {0, 1, 2, 5, 1, 0};
        int [] arr2 = {1, 2, 2, 2, 1};
        System.out.println(getPeaks(arr));
        System.out.println(getPeaks(arr2));
    }

    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        List<Integer> indexes = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                indexes.add(i);
                values.add(arr[i]);

            }else if(arr[i] > arr[i - 1] && arr[i] == arr[i + 1]){
                int plateauStart = i;

                while(i < arr.length - 1 && arr[i] == arr[i + 1]){
                    i++;
                }

                if(i < arr.length - 1 && arr[i] > arr[i + 1]){
                    indexes.add(plateauStart);
                    values.add(arr[plateauStart]);
                }

            }
        }

        Map<String, List<Integer>> peaks = new HashMap<>();
        peaks.put("pos", indexes);
        peaks.put("peaks", values);
        return peaks;
    }
}
