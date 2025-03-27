package codewars.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask2 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squared = mapToSquares(numbers);
        System.out.println("Squared numbers: " + squared);
    }

    public static List<Integer> mapToSquares(List<Integer> list) {

        return list.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
    }
}

