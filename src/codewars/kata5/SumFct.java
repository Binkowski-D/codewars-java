package codewars.kata5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SumFct {
    public static void main(String[] args) {

        System.out.println(perimeter(BigInteger.valueOf(5)));
        System.out.println(perimeter(BigInteger.valueOf(7)));

    }

    public static BigInteger perimeter(BigInteger n) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        List<BigInteger> sums = new ArrayList<>();
        sums.add(a);
        sums.add(b);

        for(BigInteger i = BigInteger.TWO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)){
            BigInteger result = a.add(b);
            a = b;
            b = result;

            sums.add(b);
        }

        BigInteger sum = sums.stream().
                reduce(BigInteger.ZERO, BigInteger::add);

        return BigInteger.valueOf(4).multiply(sum);
    }
}
