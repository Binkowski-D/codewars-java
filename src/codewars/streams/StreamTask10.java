package codewars.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTask10 {

    public static void main(String[] args) {
        List<Human> people = Arrays.asList(
                new Human("Anna", Arrays.asList("English", "German")),
                new Human("Bob", Arrays.asList("French", "Finnish")),
                new Human("Clara", Arrays.asList("English", "Spanish"))
        );

        Map<Character, List<String>> result = groupLanguagesByFirstLetter(people);
        System.out.println("Languages grouped by first letter: " + result);
    }

    public static Map<Character, List<String>> groupLanguagesByFirstLetter(List<Human> list) {

        Map<Character, List<String>> result = list.stream()
                .map(Human::getLanguages)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.groupingBy(l -> l.charAt(0), TreeMap::new, Collectors.mapping(Function.identity(), Collectors.toList())));

        result.replaceAll((k, v) -> v.stream().sorted().collect(Collectors.toList()));

        return result;

    }
}

class Human {
    private final String name;
    private final List<String> languages;

    public Human(String name, List<String> languages) {
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
