package codewars.kata7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleTask {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1,5,8,1,42,64,234));
        List<Integer> numbers2 = new ArrayList<>();
        System.out.println(getEvensNumbers(numbers));
        System.out.println(getEvensNumbers(numbers2));

    }

    public static List<Integer> getEvensNumbers(List<Integer> numbers){
        return numbers == null ? List.of() :
                 numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
    }
}
