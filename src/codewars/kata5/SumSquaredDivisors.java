package codewars.kata5;

import java.util.*;

public class SumSquaredDivisors {
    public static void main(String[] args) {

        System.out.println(listSquared(1, 250));
        System.out.println(listSquared(42, 250));

    }

    public static String listSquared(long m, long n) {
        Map<Long,Long> map = new TreeMap<>();

        for(long i = m; i <= n; i++){
            List<Long> list = new ArrayList<>();
            for(long j = 1; j <= i; j++){
                if(i % j == 0){
                    list.add(j);
                }
            }

            long sum = 0;

            for(int k = 0; k < list.size(); k++){
                long tmp = list.get(k) * list.get(k);
                sum += tmp;
            }

            long sqrt = (long)Math.sqrt(sum);
            if(sqrt * sqrt == sum){
                map.put(i, sum);
            }
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        Iterator<Map.Entry<Long,Long>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Long, Long> entry = iterator.next();
            builder.append("[").append(entry.getKey()).append(", ").append(entry.getValue()).append("]");
            if(iterator.hasNext()){
                builder.append(", ");
            }
        }

        builder.append("]");

        return builder.toString();
    }
}
