package day32_DateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_localDate {
    public static void main(String[] args) {

        LocalDate trh=LocalDate.now();//objenin olusturuldugu tarihi trh ye atar
        LocalDate baskaTrh=LocalDate.of(1972,1,18);

        //istedigimiz yil,ay ve gun degerlerine gore bize obje olusturur.
        System.out.println(trh);
        //get'li methodlarda tareihle ilgili detay bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth());
        System.out.println(trh.getDayOfWeek());
        System.out.println(trh.getMonthValue());
        System.out.println(trh.getYear());

        //bir tarihte istedigimiz kadar ileri yada geri gidebiliriz

        System.out.println(trh.minusWeeks(20));//2021-11-11
        System.out.println(trh.minusWeeks(5).minusDays(3));//2022-02-21

        System.out.println(trh.plusMonths(9).plusDays(10));//2023-01-10

        //istedigimiz ulkenin o andaki tarihini elde etmek istersek

        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));//2022-04-01
        System.out.println(trhZone);


        //is ile baslayan methodlar
        System.out.println(LocalDate.now().isLeapYear());//false
        System.out.println(trh.isAfter(baskaTrh));//true



    }
}

