package codewars.kata6;

public class DigPow {
    public static void main(String[] args) {

        System.out.println(digPow(89, 1));
        System.out.println(digPow(92, 1));
        System.out.println(digPow(695, 2));

    }


    public static long digPow(int n, int p) {
        long sum = 0;
        String number = String.valueOf(n);

        for (char digit : number.toCharArray()) {
            sum += Math.pow(digit - '0', p++);
        }

        return (sum % n == 0) ? sum / n : -1;
    }
}
