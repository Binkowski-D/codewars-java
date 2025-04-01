package codewars.kata6;

import java.util.HashMap;
import java.util.Map;

public class PrimeFactorizer {
    public static void main(String[] args) {
        System.out.println(new PrimeFactorizer().factor(24)); //should return { 2 => 3, 3 => 1 }
        System.out.println(new PrimeFactorizer().factor(100));
    }

    public Map<Long, Integer> factor(long n){
        Map<Long, Integer> pairs = new HashMap<>();

        for(long i = 2; i * i <= n; i++){
            int v = 0;
            if(n % i == 0){
                while(n % i == 0){
                    v++;
                    n /= i;
                }
            }
            if(v > 0) {
                pairs.put(i, v);
            }
        }

        if (n > 1){
            pairs.put(n, 1);
        }

        return pairs;
    }
}
