package codewars.kata5;


public class MaximumContiguousSum {

    public static void main(String[] args) {
        int[] a = {3, -4, 8, 7, -10, 19, -3};
        int[] b = {-8, -10, -12, -2, -3, 5};

        System.out.println(maxContiguousSum(a)); // returns 24
        System.out.println(maxContiguousSum(b)); //  returns 5
    }


    public static int maxContiguousSum(final int[] arr) {
        int maxSum = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
           sum += arr[i];

            if(sum < 0){
                sum = 0;
                continue;
            }

           if(sum > maxSum){
               maxSum = sum;
           }

        }
        return maxSum;
    }
}
