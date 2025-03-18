package codewars.kata6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAspecificElementOfAnArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 23, 2, -8, 5};
        int[] arr2 = {10, 20, -30, 100, 200};

        System.out.println(Arrays.deepToString(selectSubarray(arr1)));
        System.out.println(Arrays.deepToString(selectSubarray(arr2)));

    }

    public static int[][] selectSubarray(final int[] arr) {
      Double [] qValues = new Double[arr.length];
      for(int i = 0; i < arr.length; i++){
          double sum = 0;
          double product = 1;

          for(int j = 0; j < arr.length; j++){
              if(j != i){
                  sum += arr[j];
                  product *= arr[j];
              }
          }

          if(sum != 0){
              qValues[i] = Math.abs(product / sum);
          }else{
              qValues[i] = null;
          }
      }

      List<Integer> indexes = new ArrayList<>();
      indexes.add(0);

      for(int i = 1; i < arr.length; i++){
          if(qValues[i] != null){
              if(qValues[i] < qValues[indexes.get(0)]){
                  indexes.clear();
                  indexes.add(i);
              }else if(qValues[i].equals(qValues[indexes.get(0)])){
                  indexes.add(i);
              }
          }
      }

      int [][] result = new int[indexes.size()][2];
      for(int i = 0; i < indexes.size(); i++){
          result[i][0] = indexes.get(i);
          result[i][1] = arr[indexes.get(i)];
      }

      return result;

    }
}
