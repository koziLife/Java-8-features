package FunctionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateEx {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> (x > y);

        boolean res = biPredicate.test(4, 9);
        System.out.println(res);
    }
}
