package FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateEx {

    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> (x > 0);

        boolean res1 = predicate.test(4);
        System.out.println(res1);
    }
}
