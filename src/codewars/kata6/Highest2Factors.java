package codewars.kata6;

import java.util.Arrays;

public class Highest2Factors {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(highestBiPrimeFac(2, 3, 50))); // [48, 4, 1]
        System.out.println(Arrays.toString(highestBiPrimeFac(5, 11, 1000))); // [605, 1, 2]
        System.out.println(Arrays.toString(highestBiPrimeFac(3, 13, 5000))); // [4563, 3, 2]
        System.out.println(Arrays.toString(highestBiPrimeFac(5, 7, 5000))); // [4375, 4, 1]
    }

    public static long[] highestBiPrimeFac(long p1, long p2, long n) {
        long [] result = new long[3];
        long maxValue = 0;

        for(long i = 1, powerOfP1 = p1; powerOfP1 <= n; i++, powerOfP1 *= p1){
            if(powerOfP1 * p2 > n){
                break;
            }

            for(long j = 1, powerOfP2 = p2; powerOfP2 <= n; j++, powerOfP2 *= p2){
                long tmpValue = powerOfP1 * powerOfP2;

                if(tmpValue > n){
                    break;
                }

                if(tmpValue > maxValue){
                    maxValue = tmpValue;
                    result[0] = maxValue;
                    result[1] = i;
                    result[2] = j;
                }
            }
        }

        return result;
    }
}
