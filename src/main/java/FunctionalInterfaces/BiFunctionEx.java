package FunctionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionEx {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> biFunction = (x, y) -> "result: "+ (x +y);

        String res = biFunction.apply(34, 21);
        System.out.println(res);
    }
}
