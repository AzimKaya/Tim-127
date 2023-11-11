package day20_Mutable_İnMutable;

import java.time.LocalDate;
import java.util.Locale;

public class C03_LocalData {
    public static void main(String[] args) {

        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);//2023-10-03

        System.out.println(localDate.plusWeeks(10));//2023-12-12
        System.out.println(localDate.plusMonths(4).plusDays(5));

        System.out.println(localDate.minusYears(3).minusMonths(2).minusDays(13));//2020-07-21

        System.out.println(localDate.withMonth(5));//2023-05-03

        System.out.println(localDate.isLeapYear());

        LocalDate dogumtarihi1=LocalDate.of(1996,7,12);
        LocalDate dogumtarihi2=LocalDate.of(2000,10,10);

        System.out.println(dogumtarihi1.isLeapYear());//true
        System.out.println(dogumtarihi2.isLeapYear());//true

        System.out.println(dogumtarihi1.isBefore(dogumtarihi2));
        System.out.println(dogumtarihi1.isAfter(dogumtarihi2));

        System.out.println(localDate.lengthOfYear());
        System.out.println(dogumtarihi1.lengthOfYear());

        System.out.println(localDate.getDayOfYear());

        System.out.println(dogumtarihi1.getDayOfWeek());
        System.out.println(localDate.getDayOfWeek());


    }
}
