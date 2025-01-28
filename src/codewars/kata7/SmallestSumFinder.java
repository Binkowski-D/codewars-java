package codewars.kata7;

public class SmallestSumFinder {

    public static void main(String[] args) {

        long [] array = {10, 343445353, 3453445, 3453545353453L};
        System.out.println(sumTwoSmallestNumbers(array));

    }

    public static long sumTwoSmallestNumbers(long[] numbers) {
        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;

        for(long number : numbers){
            if(number < min1){
                min2 = min1;
                min1 = number;
            }else if(number < min2){
                min2 = number;
            }
        }
        return min1 + min2;
    }
}
