package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamApiEx {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("ayse", "fatma", "hayriye");
        // 1) forEach
        //names.stream().forEach(e -> System.out.println(e));
        //Or
        names.stream().forEach(System.out::println);
        System.out.println("--------------------------");
        // 2) Filter
        Stream<String> stream = names.stream();
        Predicate<String> predicate = name -> name.length() > 5;
        Stream<String> filtered = stream.filter(predicate);

        filtered.forEach(System.out::println);
        System.out.println("--------------------------");
        //OR
        names
                .stream()
                .filter(name -> name.length() > 5)
                .forEach(System.out::println);
        System.out.println("--------------------------");
        // 3) Distinct
        IntStream numberStream = IntStream.of(4, 1, 2, 1, 3, 4, 5, 3, 2, 6, 6, 3);
        numberStream
                .distinct()
                .forEach(System.out::println);
        System.out.println("--------------------------");
        // 4) sorted
        IntStream intStream = IntStream.of(2,4,1,6,3,2,6,9,4,2,1);
        intStream
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("--------------------------");
        // 5) Limit
        LongStream longStream = LongStream.range(1, 1000);
        longStream
                .limit(3)
                .forEach(System.out::println);
        System.out.println("--------------------------");
        // 6) Count
        IntStream range = IntStream.range(1, 10);
        IntStream rangeClosed = IntStream.rangeClosed(1, 10);

        System.out.println(range.count());
        System.out.println(rangeClosed.count());

        System.out.println("--------------------------");

        // 7) Collect
        List<String> employees = Arrays.asList("Ayse", "Fatma", "Hayriye", "Osman", "Osman");

        List<String> list = employees.stream().collect(Collectors.toList());
        System.out.println(list);

        Set<String> set = employees.stream().collect(Collectors.toSet());
        System.out.println(set);

        Long count = employees.stream().collect(Collectors.counting());
        System.out.println(count);

        String str = employees.stream().collect(Collectors.joining("-"));
        System.out.println(str);

        Map<Integer, List<String>> map = employees.stream().collect(Collectors.groupingBy(name -> name.length()));
        System.out.println(map);

        System.out.println("--------------------------");

        // 8) Map
        List<String> cities = Arrays.asList("Istanbul", "London");
        List<String> cityList = cities.stream().map(city -> city.toUpperCase()).collect(Collectors.toList());
        System.out.println(cityList);

        IntStream.rangeClosed(1, 5).map(x -> x * x).forEach(System.out::println);

        System.out.println("--------------------------");
        // 9) Reduce
        int reduce = IntStream.of(1, 2, 3, 4, 5).reduce(0, (a, b) -> a + b);
        System.out.println("sum: "+reduce);

        System.out.println("--------------------------");

        int res1 = IntStream.rangeClosed(1, 5).reduce(1, (x, y) -> x * y);
        System.out.println("res1: "+res1);

        //OR
        int res2 = IntStream.rangeClosed(1, 5).reduce(1, Math::multiplyExact);
        System.out.println("res2: "+res2);

        System.out.println("--------------------------");

        // 10) map & reduce
        Integer totalAge = getCustomers()
                            .stream()
                            .filter(e -> e.getAge() != null)
                            .map(customer -> customer.getAge())
                            .reduce(0, (a, b) -> a + b);
        System.out.println(totalAge);

        System.out.println("--------------------------");
        // 11) Parallel Stream
        List<Integer> numbs = Arrays.asList(6,3,8,3,9,1);
        int res3 = numbs
                .parallelStream()
                .filter(Objects::nonNull)
                .filter(a -> a > 6)
                .sorted()
                .reduce(1, (a, b) -> a * b);

        System.out.println("res3: "+ res3);

        System.out.println("--------------------------");

    }

    public static List<Customer> getCustomers(){
        Customer c1 = new Customer("Ayse", null);
        Customer c2 = new Customer("Fatma", 18);
        Customer c3 = new Customer("Hayriye", 19);
        Customer c4 = new Customer("Osman", 17);

        return Arrays.asList(c1, c2, c3, c4);
    }
}

class Customer{
    private String name;
    private String surname;
    private Integer age;

    public Customer(final String name, final Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
}
