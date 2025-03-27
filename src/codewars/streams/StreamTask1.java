package codewars.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> even = filterEven(numbers);
        System.out.println("Even numbers: " + even);
    }

    public static List<Integer> filterEven(List<Integer> list) {

        return list.stream().filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
}
