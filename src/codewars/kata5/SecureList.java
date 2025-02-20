package codewars.kata5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SecureList {

    public static void main(String[] args) {
        int[] base = new int[]{1, 2, 3, 4};
        SecureList secureList = new SecureList(base);
        System.out.println(secureList.get(0)); // should print 1
        System.out.println(secureList); //  should print 2, 3, 4 and clear the list
        System.out.println(secureList); // should print []
    }

    private List<Integer> numbers;

    public SecureList(int[] array){
        this.numbers = new ArrayList<>();
        for(int number : array){
            this.numbers.add(number);
        }
    }

    public int get(int index){
        int number = numbers.get(index);
        numbers.remove(index);
        return number;
    }

    public String toString(){
        String result = numbers.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(",", "[", "]"));
        numbers.clear();
        return result;
    }

    public int size(){
        return numbers.size();
    }

}
