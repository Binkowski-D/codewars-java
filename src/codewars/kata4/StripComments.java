package codewars.kata4;

public class StripComments {
    public static void main(String[] args) {

        System.out.println(stripComments("apples, pears # and bananas\n" +
                "grapes\n" +
                "bananas !apples", new String[]{"#", "!"}));

        System.out.println("----------------------------------------------");

        System.out.println(stripComments("a # comment\n " +
                "b\n" +
                "c", new String[]{"#"}));

    }

    public static String stripComments(String text, String[] commentSymbols) {

        String [] lines = text.split("\n");

        for(int i = 0; i < lines.length; i++){
            for(String symbol : commentSymbols){
                int index = lines[i].indexOf(symbol);
                if(index != -1){
                    lines[i] = lines[i].substring(0, index);
                }
            }

            lines[i] = lines[i].stripTrailing();
        }


        return String.join("\n", lines);
    }
}
