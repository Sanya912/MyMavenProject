package streaming.listInStream;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctInterfaces {

    @Test
    void predicateTest(){
        List<String> list = Arrays.asList("Ales", "alik", "malik", "car");
        Predicate<String> predicate = x -> x.contains("al");
        Stream<String> stringStream = list.stream().filter(predicate);
        stringStream.forEach(System.out::println);
    }

    @Test
    void mapTest(){
        Map<Integer, String> map = new HashMap<>();
        map.put(12, "lio");
        map.put(15, "Leo");
        map.forEach((age, name) -> System.out.println("Age is: " + age+ " Name is :" + name));
    }

}
