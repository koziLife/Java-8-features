package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> consumer = e -> System.out.println(e);
        List<String> names = Arrays.asList("a","b", "c");

        names.forEach(consumer);

        Consumer<String> consumer1 = User::retrieve;
        consumer1.accept("osman");

        names.forEach(User::retrieve);
    }
}

class User{

    public static void retrieve(String e){
        System.out.println(e);
    }
}
