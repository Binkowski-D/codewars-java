package codewars.kata5;

import java.util.Arrays;

public class PerfectPower {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(isPerfectPower(4)));
        System.out.println(Arrays.toString(isPerfectPower(5)));
        System.out.println(Arrays.toString(isPerfectPower(8)));
        System.out.println(Arrays.toString(isPerfectPower(9)));

    }

    public static int[] isPerfectPower(int n) {
        if(n == 1){
            return null;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            for(int j = 2; Math.pow(i,j) <= n; j++){
                if(Math.pow(i,j) == n){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
