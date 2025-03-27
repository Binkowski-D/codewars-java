package codewars.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTask4 {

    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "blue", "green", "red", "blue", "red");
        Map<String, Long> occurrences = countColorOccurrences(colors);
        System.out.println("Color occurrences: " + occurrences);
    }

    public static Map<String, Long> countColorOccurrences(List<String> list) {

        return list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
