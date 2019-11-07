package timeTestPack;

import org.testng.annotations.Test;
import sun.security.jca.GetInstance;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TimeTesting {
    @Test
    public void timeTesing() {
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());
        System.out.println(Instant.now().plus(1, ChronoUnit.HOURS));

    }

    @Test
    void changeTime() {
        LocalTime localTime = LocalTime.of(8, 58, 45);
        System.out.println(localTime);
        LocalDate localDate = LocalDate.of(2002, 12, 05);
        System.out.println(localDate);
    }

    @Test
    void testZone() {
        LocalDate localDate = LocalDate.of(2010, Month.AUGUST, 11);
        LocalTime localTime = LocalTime.of(15, 02);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime1);
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.APRIL, 20, 6, 15, 30);
        System.out.println(localDateTime);

        ZoneId zoneId = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);
        System.out.println(ZoneId.systemDefault());
    }

    @Test
    void playTime (){
        LocalDate localDate = LocalDate.of(2020, Month.AUGUST, 15);
        LocalDate localDate1 = localDate.plusDays(2);
        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate1.plusYears(5));
        localDate1.plusYears(11);
        System.out.println(localDate1);
    }

    @Test
    void myTest(){
        List<String> list = Arrays.asList("Hi", "there");
        List<String> t = list.stream().filter(a -> a.contains("i")|| a.contains("H")).collect(Collectors.toList());
        t.forEach(System.out::print);
    }

    @Test
void testPeriod(){
        Period annually = Period.ofDays(10);
        System.out.println(annually);
    }


}
