package streaming.listInStream;

import com.google.common.primitives.Ints;
import org.testng.annotations.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class ListInStream {


//    @Test
    void listInInStreamList() {
        List<Integer> num = new ArrayList<>();
        num.add(45);
        num.add(4);
        List<Character> chars = new ArrayList<>();
        chars.add('c');
        chars.add('f');
        Stream<List<?>> stream = Stream.of(num, chars);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ddd");
        Stream<StringBuilder> strin = stream.map(a -> stringBuilder.append(a));
        System.out.println(stringBuilder);
//        System.out.println(stringBuilder);
    }

    @Test
    void sortedOrNot(){
        //infinite
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);


    }

    @Test
    void checkOnPeak(){
        Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5)
//                .peek(System.out::print)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print);


    }

    @Test
    void reduceTest(){
        Stream<Integer> inte = Stream.of(4, 7);
        System.out.println(inte.reduce(0, (s,n) -> s+n));
/*        Optional<Integer> in = inte.reduce((s, n) -> s+n); //same result
        System.out.println(in.get());*/
    }

    @Test
    void sumTest(){
        Stream<Integer> in = Stream.of(3,3,1,2);
        int sum = in.mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }

    @Test
    void averageTest(){
//        Stream<Integer> in = Stream.of(5, 7, 9);
//        System.out.println(in.mapToDouble(Integer::doubleValue).average());
        IntStream intStream = IntStream.of(5, 7, 9);
//        OptionalDouble average =
                System.out.println(intStream.average());
//        System.out.println(average.getAsDouble());
    }

    @Test
    void generateTest(){
        DoubleStream doubleStream = DoubleStream.generate(Math::random);
        doubleStream.limit(1).forEach(System.out::println);

        new Random().ints(1, 1, 20).forEach(System.out::println);
        System.out.println();
        IntStream in = IntStream.range(1,10);
        in.forEach(System.out::print);

    }

    @Test
    void intStreaming(){
        IntStream stream = IntStream.rangeClosed(1,4);
        OptionalDouble optionalDouble = stream.average();
        System.out.println((optionalDouble));
    }

@Test
    void optionalTest(){
        IntStream stream = IntStream.rangeClosed(5,10);
    OptionalDouble optionalDouble = stream.average();
    optionalDouble.ifPresent(System.out::print);
}

@Test
    void streamListTest(){
        List<String> cars = new ArrayList<>();
        cars.add("Bmws");
        cars.add("To");
        cars.add("Pop");

    Stream<String> stream = cars.stream();
    cars.add("Mercedec");
    stream.forEach(System.out::println);
}

@Test
    void summarize(){
        List<String> list = Arrays.asList("car", "res");
        list.stream().map(String::toUpperCase);
        List<Integer> in = Arrays.asList(4,5,6);
    DoubleSummaryStatistics collect = in.stream().map(Integer::doubleValue).collect(Collectors.summarizingDouble(Double::byteValue));
    System.out.println(collect.getAverage());
    }

    @Test
    void joiningTest(){
        List<String> list = Arrays.asList("Rio", "Kyiv", "New York");
        String collect = list.stream().collect(Collectors.joining(":city,  "));
        System.out.println(collect);
    }

    @Test
    void groupingTest(){
        List<String> list = Arrays.asList("Banana", "Kiwi", "Banana", "Orange", "Orange");
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }

    @Test
    void treeSetAndStream(){
        Stream<String> stream = Stream.of("car", "food", "baby", "football");
        TreeSet<String> foo = stream.filter(a -> a.startsWith("foo")).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(foo);
    }

}



