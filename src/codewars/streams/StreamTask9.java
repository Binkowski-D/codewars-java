package codewars.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTask9 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Anna", Arrays.asList("English", "German")),
                new Person("Bob", Arrays.asList("French")),
                new Person("Clara", Arrays.asList("English", "Spanish"))
        );

        List<String> allLanguages = extractAllLanguages(people);
        System.out.println("All languages: " + allLanguages);
    }

    public static List<String> extractAllLanguages(List<Person> list) {

        return list.stream()
                .map(Person::getLanguages)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}

class Person {
    private final String name;
    private final List<String> languages;

    public Person(String name, List<String> languages) {
        this.name = name;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public List<String> getLanguages() {
        return languages;
    }
}
