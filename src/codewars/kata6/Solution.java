package codewars.kata6;

import java.lang.StringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution{

  public static void main(String[] args) {
    System.out.println(toCamelCase("the-stealth-warrior"));
    System.out.println(toCamelCase("The_Stealth_Warrior"));
    System.out.println(toCamelCase("The_Stealth-Warrior"));
  }


  static String toCamelCase(String s){
    if(s.isEmpty()){
      return s;
    }

    Pattern pattern = Pattern.compile("[-_]([a-zA-Z])");
    Matcher matcher = pattern.matcher(s);
    StringBuilder result = new StringBuilder(s.length());

    while (matcher.find()){
      matcher.appendReplacement(result, matcher.group(1).toUpperCase());
    }

    matcher.appendTail(result);

    return s.charAt(0) + result.substring(1);


  }
}