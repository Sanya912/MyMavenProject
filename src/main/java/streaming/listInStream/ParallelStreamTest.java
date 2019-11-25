package streaming.listInStream;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamTest {

    @Test
    void parallelStreamTest() {

        Stream<Integer> stream = Arrays.asList(6, 8, 9).stream();
        stream.forEach(System.out::print);
        Stream<Integer> parallel = stream.parallel();
//        parallel.forEach(System.out::print);
    }

    @Test
    void parallelStreamTestTWO() {
        Stream<Integer> stream = Arrays.asList(4, 5, 2, 3).parallelStream();
        stream.forEachOrdered(System.out::print);
    }

    @Test
    void parallelStreamTestThree() {
        Arrays.asList("jackal", "kangaroo", "lemur")
                .parallelStream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    @Test
    void skipInParalTest() {
        List<String> list = Arrays.asList(" f ", " sec ", " third ", " Fifth ");
        list.parallelStream().forEach(System.out::print);
        System.out.println();
        list.parallelStream().skip(2).forEach(System.out::print);
    }

    @Test
    void reduceTest() {
        List<Integer> list = Arrays.asList(5, 6, 6, 6, 4, 1);
        System.out.println(list.stream().reduce(0, (a, b) -> (a - b))); //insted of 0 can put any digit but -anyDigit
    }

    @Test
    void groupedTest() {
        Stream<String> test1 = Stream.of("test1", "Test2", "test3", "te");
        ConcurrentMap<Integer, List<String>> collect = test1.collect(Collectors.groupingByConcurrent(String::length));
        System.out.println(collect);
    }

    @Test
    void testRandom() {
        for (int i=0; i<20; i++)
        System.out.println((double)new Random().nextInt(100));
    }



}
