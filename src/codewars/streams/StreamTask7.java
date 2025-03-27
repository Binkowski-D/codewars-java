package codewars.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask7 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 28),
                new Employee("Bob", 35),
                new Employee("Charlie", 32),
                new Employee("Diana", 25),
                new Employee("Ethan", 40)
        );

        List<String> result = getNamesOfOlderEmployees(employees);
        System.out.println("Employees aged 30+ (sorted): " + result);
    }

    public static List<String> getNamesOfOlderEmployees(List<Employee> list) {

        return list.stream()
                .filter(employee -> employee.getAge() >= 30)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());

    }
}

class Employee {
    private final String name;
    private final int age;

    public Employee(String name, int age) {
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

