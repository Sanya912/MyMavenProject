package timeTestPack;

import net.bytebuddy.asm.Advice;
import org.testng.annotations.Test;
import sun.security.jca.GetInstance;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    @Test
    void epoSec(){


    }

    @Test
    void zoneTest(){
        LocalDate localDate = LocalDate.of(2019, Month.NOVEMBER, 17);
        LocalTime localTime = LocalTime.of(10,19);
        ZoneId zoneId = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, zoneId);
        System.out.println(zonedDateTime);
    }

    @Test
    void stringTest(){
        String s4 = "1" +2+3;
        String s5= 1+2+"3";
        System.out.println(s4);
        System.out.println(s5);
    }

    @Test
    void testInstance(){
        double price = 48;
        NumberFormat us = NumberFormat.getCurrencyInstance();
        System.out.println(us.format(price));
    }

    @Test
    void transferToDollars(){
        NumberFormat en = NumberFormat.getCurrencyInstance(Locale.CANADA);
        NumberFormat ger = NumberFormat.getCurrencyInstance(Locale.GERMAN);
        NumberFormat fer = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(fer.format(20.20));
    }

    @Test
    void parseTest() throws ParseException {
        NumberFormat en = NumberFormat.getInstance(Locale.US);
        NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
        String s = "40.45";
        System.out.println(en.parse(s)); // 40.45
        System.out.println(fr.parse(s)); // 40
    }

    @Test
    void parseBucks() throws ParseException {
        String sum = "$9543.56";
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        System.out.println(numberFormat.parse(sum));
    }

    @Test
    void dateTimeFormat(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        LocalDateTime localDateTime = LocalDateTime.of(2015, 11, 10, 11,04,34);
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        LocalTime localTime = LocalTime.of(11,07);
        System.out.println(dayOfWeek);
        System.out.println(localDateTime.format(dateTimeFormatter));
    }

    @Test
    void dateTimeFormatTest(){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh::mm");
        DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd::MM::yyyy");
        LocalTime localTime = LocalTime.of(12,13);
        LocalDate localDate = LocalDate.of(2015, 10, 12);
        System.out.println(localTime.format(f));
        System.out.println(localDate);
        System.out.println(localDate.format(dd));
    }

    @Test
    void TESTexam(){
        new Locale("hi");
    }

    @Test
    void loopWhileTest() throws InterruptedException {
        Random random = new Random();
        IntStream ints = random.ints(1, 0, 10);
                ints.forEachOrdered(System.out::println);

    }



}
