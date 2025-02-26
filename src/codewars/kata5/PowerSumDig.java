package codewars.kata5;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class PowerSumDig {
    public static void main(String[] args) {

        System.out.println(powerSumDigTerm(1));
        System.out.println(powerSumDigTerm(2));
        System.out.println(powerSumDigTerm(3));
        System.out.println(powerSumDigTerm(4));
        System.out.println(powerSumDigTerm(29));

    }

    public static long powerSumDigTerm(int n) {
        TreeSet<Long> validNumbers = new TreeSet<>();

        for(int sum = 2; sum <= 100; sum++){
            long power = sum;
            for(int exp = 2; power < 1_000_000_000_000_000L; exp++){
                power *= sum;
                if(digitSum(power) == sum){
                    validNumbers.add(power);
                }
            }
        }
        List<Long> sortedList = new ArrayList<>(validNumbers);
        return sortedList.get(n - 1);

    }

    private static int digitSum(long num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
