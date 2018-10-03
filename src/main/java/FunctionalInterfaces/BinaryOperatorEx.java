package FunctionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorEx {

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> (a +b);

        Integer res = binaryOperator.apply(43, 4);
        System.out.println(res);
    }
}
