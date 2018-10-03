package FunctionalInterfaces;

import java.util.function.Function;

public class FunctionEx {

    public static void main(String[] args) {
        Function<Integer, Integer> function = x -> x + 4;

        Integer result = function.apply(46);

        System.out.println(result);
    }
}
