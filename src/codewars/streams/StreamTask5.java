package codewars.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTask5 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Adam", "Bob", "Charlie", "Carla", "Brian", "Amanda");
        Map<Character, Long> result = countByFirstLetter(names);
        System.out.println("Names grouped by first letter: " + result);
    }

    public static Map<Character, Long> countByFirstLetter(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.counting()));
    }
}
