package codewars.kata6;

public class SimpleMaxDigitSum {
    public static void main(String[] args) {
        System.out.println(solve(1)); // 1
        System.out.println(solve(2)); // 2
        System.out.println(solve(18)); // 18
        System.out.println(solve(48)); // 48
        System.out.println(solve(100)); // 99
        System.out.println(solve(10)); // 9
        System.out.println(solve(110)); // 99
        System.out.println(solve(2090)); // 1999
        System.out.println(solve(999999999992L)); // 999999999989

    }

    public static long solve(long n) {
        String s = Long.toString(n);
        int maxSum = digitSum(n);
        long best = n;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                continue;
            }

            StringBuilder sb = new StringBuilder(s);
            sb.setCharAt(i, (char)(s.charAt(i) - 1));

            for(int j = i + 1; j < s.length(); j++){
                sb.setCharAt(j, '9');
            }

            long candidate = Long.parseLong(sb.toString());
            int candidateSum = digitSum(candidate);
            if(candidateSum > maxSum || (candidateSum == maxSum && candidate > best)){
                best = candidate;
                maxSum = candidateSum;
            }
        }
            return best;
    }

    private static int digitSum(long num) {
        int sum = 0;

        while(num > 0){
            sum+= num % 10;
            num /= 10;
        }
        return sum;
    }
}