package Optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {

    public static void main(String[] args) {
        Optional<Double> empty = Optional.empty();
        Optional<String> of = Optional.of("hello");
        // throws null pointer exception
        //Optional<String> ofNull = Optional.of(null);
        Optional<String> ofNullable = Optional.ofNullable(null);

        // 1) ifPresent
        Integer number = 4;

        Optional
                .ofNullable(number)
                .ifPresent(x -> {
                    Double res = Math.pow(number, 2);
                    System.out.println(res);
        });
        System.out.println("--------------------------");
        // 2) Map

        Optional<Integer> opt1 = Optional.ofNullable(number);
        opt1.map(x -> Math.pow(x, 2)).ifPresent(System.out::println);

        System.out.println("--------------------------");

        // 3) Filter
        String message = null;

        if(message != null)
            if(message.length() > 4)
                System.out.println(message);
        //OR
        Optional
                .ofNullable(message)
                .filter(m -> m.length() > 4)
                .ifPresent(System.out::println);

        // 4) orElse
        Integer age = 63;
        Integer result1 = (age != null) ? age: 0;
        System.out.println(result1);

        Optional<Integer> ageOpt = Optional.ofNullable(age);
        Integer integer = ageOpt.orElse(0);
        System.out.println(integer);

        System.out.println("--------------------------");

        // 5) orElseGet
        List<String> girls = Arrays.asList("Ayse", "Fatma", "Hayriye");
        Optional<List<String>> list = Optional.ofNullable(girls);
        list.orElseGet(() -> new ArrayList<>());
        list.orElseGet(ArrayList::new);

        // 6) orElseThrow
        Integer a = null;
        Optional<Integer> optionalInteger = Optional.ofNullable(a);
        optionalInteger.orElseThrow(RuntimeException::new);
    }
}
