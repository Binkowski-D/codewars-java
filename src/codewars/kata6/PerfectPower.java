package codewars.kata6;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class PerfectPower {
    public static void main(String[] args) {

        System.out.println(mulPower(100,3));
        System.out.println(mulPower(36,2));
        System.out.println(mulPower(72,4));
        System.out.println(mulPower(1152,3));
        System.out.println(mulPower(5,2));
        System.out.println(mulPower(376051, 9));

    }

    public static BigInteger mulPower(final int n, final int k) {
        double root = Math.pow(n, 1.0 / k);
        if(Math.round(root) == root){
            return BigInteger.ONE;
        }

        int m = n;

        Map<Integer, Integer> map = new HashMap<>();
        while(m % 2 == 0){
            map.merge(2, 1, Integer::sum);
            m /= 2;
        }

        for(int i = 3; i * i <= m; i+= 2){
            while(m % i == 0){
                map.merge(i, 1, Integer::sum);
                m/= i;
            }
        }

        if(m > 1){
            map.merge(m, 1, Integer::sum);
        }

        BigInteger x = BigInteger.ONE;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int prime = entry.getKey();
            int exponent = entry.getValue();

            if(exponent % k != 0){
                int missingPower = k - (exponent % k);
                x = x.multiply(BigInteger.valueOf(prime).pow(missingPower));
            }
        }

        return x;
    }
}
