package codewars.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask3 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Daniel", "Tom", "Elizabeth", "John");
        List<String> result = filterAndUppercase(names);
        System.out.println("Filtered and uppercased names: " + result);
    }

    public static List<String> filterAndUppercase(List<String> list) {

        return list.stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
