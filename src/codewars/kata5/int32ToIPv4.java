package codewars.kata5;

public class int32ToIPv4 {
    public static void main(String[] args) {

        System.out.println(longToIP(2149583361L)); // "128.32.10.1"
        System.out.println(longToIP(32));          // "0.0.0.32"
        System.out.println(longToIP(0));           // "0.0.0.0"


    }

    public static String longToIP(long ip) {
        return ((ip >> 24) & 255) + "." +
                ((ip >> 16) & 255) + "." +
                ((ip >> 8) & 255) + "." +
                (ip & 255);
    }

}
