package streaming.listInStream;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapTest {

    @Test
    void numLength(){
        Stream<String> stream = Stream.of("car", "reo", "lops");
        Map<String, Integer> mapping = stream.collect(Collectors.toMap(a -> a, String::length));
        System.out.println(mapping);
    }

    @Test
    void grouping(){
        Stream<String> stream = Stream.of("bla", "bla", "notBla");
        Map<Integer, List<String>> collect = stream.collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

    }
    @Test
    void threeMapTest(){
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println(map);

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("keyy", "value");
        System.out.println(treeMap);
    }

    @Test
    void mapTest(){
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        System.out.println(map);

    }


}
