package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierEx {

    public static void main(String[] args) {
        Supplier<List<String>> supplier = () -> new ArrayList<>();

        List<String> strings = supplier.get();
        strings.add("osman");
        strings.add("cancan");

        System.out.println(strings.size());
    }
}
