package codewars.kata5;


import java.math.BigInteger;

public class StringIncrementer {
    public static void main(String[] args) {

        System.out.println(incrementString("foo")); // foo1
        System.out.println(incrementString("foobar23")); // foobar24
        System.out.println(incrementString("foo0042")); // foo0043
        System.out.println(incrementString("foo9")); // foo10
        System.out.println(incrementString("foo099")); // foo100
    }

    public static String incrementString(String str) {
        StringBuilder builder = new StringBuilder();
        int index = -1;

        for(int i = str.length() - 1; i >= 0; i--){
            if(!Character.isDigit(str.charAt(i))){
                index = i;
                break;
            }
        }

        String text = str.substring(0, index + 1);
        String number = str.substring(index + 1);

        if(number.isEmpty()){
           return builder.append(text).append(1).toString();
        }

        builder.append(text);

        BigInteger n = new BigInteger(number);
        n = n.add(BigInteger.ONE);

        int length = number.length();

        String newNumber = String.format("%0" + length + "d", n);

        builder.append(newNumber);

        return builder.toString();
    }
}
