package codewars.kata7;

import java.util.function.IntUnaryOperator;

public class FunctionalAddition {
    public static void main(String[] args) {

        var digit = add(1);
        System.out.println(digit.applyAsInt(5));

    }

    public static IntUnaryOperator add(int n) {

        return (x) -> x + n;
    }
}
