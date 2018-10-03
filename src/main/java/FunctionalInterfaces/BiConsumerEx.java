package FunctionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerEx {

    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (name, id) -> System.out.println(name + " id: "+id);

        biConsumer.accept("osman", 24);
    }
}
