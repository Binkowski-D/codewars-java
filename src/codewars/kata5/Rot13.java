package codewars.kata5;

public class Rot13 {
    public static void main(String[] args) {

        System.out.println(rot13("test"));
        System.out.println(rot13("Test"));
        System.out.println(rot13("Hello, World!"));

    }

    public static String rot13(String str) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c = (char) (c + 13);
                if(c > 'Z'){
                    c = (char)(c - 26);
                }
            }else if(c >= 'a' && c <= 'z'){
                c = (char) (c + 13);
                if(c > 'z'){
                    c = (char) (c - 26);
                }
            }
            builder.append(c);
        }
        return builder.toString();
    }
}


