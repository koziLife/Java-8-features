package StreamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args) throws IOException {
        // You can create stream objects
        List<String> names = Arrays.asList("meryem", "osman", "useyin");

        Stream<String> stream = names.stream();
        Stream<String> parallelStream = names.parallelStream();

        //You can create stream objects with I/O
        Path dir = Paths.get("/var/log");
        Stream<Path> pathStream = Files.list(dir);

        //IntStream, DoubleStream, LongStream
        IntStream intOf = IntStream.of(1, 2, 3);
        IntStream range = IntStream.range(1, 10);

        DoubleStream doubleStream = DoubleStream.of(10.1, 2.3, 4.1);

        LongStream longStream = LongStream.of(3, 6, Long.MAX_VALUE);
        LongStream longRange = LongStream.range(1, 100);

    }
}
