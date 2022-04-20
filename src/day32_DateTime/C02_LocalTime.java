package day32_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime tm=LocalTime.now();
        System.out.println(tm);//22:10:42.048256100
        // bir islemin ne kadar surede bittigini ogrenmek istersek
        // islemden once ve sonrasi diye dege atamasi yaipi aradaki farki hesaplayabiliriz

        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;

        }

        LocalTime tmLoopSonrasi=LocalTime.now();

        System.out.println(tmLoopSonrasi);//22:14:28.773095500

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println("islem " + (nano2-nano1) + " nanosaniye bitti");

        //ileri  veya geri gidebiliriz
        System.out.println(tm.plusMinutes(1000));

        //istersek zone id kullanarak istedigimiz bolgenin saati icinde obje olusturabiliriz



    }


}
