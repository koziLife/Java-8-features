package FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorEx {

    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = x -> 2*x;

        Integer res = unaryOperator.apply(24);
        System.out.println(res);
    }
}
