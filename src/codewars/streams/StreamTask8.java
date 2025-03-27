package codewars.streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamTask8 {

    public static void main(String[] args) {
        List<Worker> workers = Arrays.asList(
                new Worker("Alice", 28),
                new Worker("Bob", 35),
                new Worker("Charlie", 28),
                new Worker("Diana", 25),
                new Worker("Ethan", 35),
                new Worker("Frank", 25)
        );

        Map<Integer, List<String>> grouped = groupWorkersByAge(workers);
        System.out.println("Workers grouped by age: " + grouped);
    }

    public static Map<Integer, List<String>> groupWorkersByAge(List<Worker> list) {

        return list.stream()
                .collect(Collectors.groupingBy(Worker::getAge,
                        Collectors.mapping(Worker::getName, Collectors.toList())));
    }
}

class Worker {
    private final String name;
    private final int age;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
