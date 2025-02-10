package codewars.kata4;

public class AddingBigNumbers {
    public static void main(String[] args) {

        System.out.println(add("125", "321"));
        System.out.println(add("123", "242525"));

    }

    public static String add(String a, String b) {
        if(a.length() != b.length()) {
            int difference;
            if (a.length() > b.length()) {
                difference = a.length() - b.length();
                for (int i = 0; i < difference; i++) {
                    b = "0" + b;
                }
            } else {
                difference = b.length() - a.length();
                for (int i = 0; i < difference; i++) {
                    a = "0" + a;
                }
            }
        }

            StringBuilder builder = new StringBuilder();
            int rest = 0;

            for(int i = a.length() - 1; i >= 0; i--){
                int fTerm = a.charAt(i) - '0';
                int sTerm = b.charAt(i) - '0';

                int result = fTerm + sTerm + rest;
                rest = result / 10;
                result = result % 10;

                builder.append(result);
            }

            if(rest > 0){
                builder.append(rest);
            }

            String result = builder.reverse().toString();

            while (result.length() > 1 && result.charAt(0) == '0') {
                result = result.substring(1);
            }

            return result;
    }
}
