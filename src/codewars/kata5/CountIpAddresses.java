package codewars.kata5;

public class CountIpAddresses {
    public static void main(String[] args) {

        System.out.println(ipsBetween("10.0.0.0", "10.0.0.50"));
        System.out.println(ipsBetween("10.0.0.0", "10.0.1.0"));
        System.out.println(ipsBetween("20.0.0.10", "20.0.1.0"));


    }

    public static long ipsBetween(String start, String end) {
        String [] startArray = start.split("\\.");
        String [] endArray = end.split("\\.");

        long minuend = 0L;
        long subtrahend = 0L;

        long[] multipliers = {16777216, 65536, 256, 1};

       for(int i = 0; i < 4; i++){
           minuend += Long.parseLong(endArray[i]) * multipliers[i];
           subtrahend += Long.parseLong(startArray[i]) * multipliers[i];

       }
        return  minuend - subtrahend;

    }
}
