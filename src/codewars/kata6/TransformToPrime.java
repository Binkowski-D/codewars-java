package codewars.kata6;

import java.util.Arrays;

public class TransformToPrime {
    public static void main(String[] args) {

        int[] a = {3, 1, 2};
        int[] b = {2, 12, 8, 4, 6};
        int[] c = {50, 39, 49, 6, 17, 28};

        System.out.println(minimumNumber(a));
        System.out.println(minimumNumber(b));
        System.out.println(minimumNumber(c));

    }

    public static int minimumNumber(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        int originalSum = sum;

        if(isPrime(sum)){
            return 0;
        }

        while (!isPrime(sum)){
            sum++;
        }

        return sum - originalSum;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if(number % 2 == 0){
            return false;
        }

        for(int i = 3; i <= Math.sqrt(number); i+= 2){
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }
}