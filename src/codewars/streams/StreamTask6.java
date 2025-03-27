package codewars.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask6 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ann", "Elizabeth", "Christopher", "Bob", "Jennifer", "Amanda", "Alex");
        List<String> result = getTop3LongestNames(names);
        System.out.println("Top 3 longest names: " + result);
    }

    public static List<String> getTop3LongestNames(List<String> list) {

        return list.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
