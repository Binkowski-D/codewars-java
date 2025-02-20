package codewars.kata5;


public class HumanReadableTime {
    public static void main(String[] args) {

        System.out.println(makeReadable(0));
        System.out.println(makeReadable(5));
        System.out.println(makeReadable(60));
        System.out.println(makeReadable(86399));
        System.out.println(makeReadable(359999));
    }

    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int s = seconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, s);
    }

}
