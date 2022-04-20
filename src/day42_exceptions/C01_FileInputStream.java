package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {
        String dosyaYolu="src/day41_Exception/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k=0;
            while ((k=fis.read()) !=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        /*
        Exception lar icinde parrent child iliskisi mevcuttur
        Eger bir kod icin birden fazla exception olusmasi ihtimali varsa
        oncelikle olasi exception lar paren child iliskisi tasiyormu bakmamiz gerekir
        eger parent child iliskisi yoksa istedigimiz
        sirada catch cumleleri olusturabiliriz

        eger parent child iliskisi varsa sadece parent exception i yazabiliriz veya ikisini
        yazmak istersek child i once parenti sonra yapmaliyiz
         */




        /*
        Alti kirmizi cizili her kod CTE degildir
        Java syntax hatalarini derleme esnasinda (compile) farkeder ve altini
        biz bu gune kadar tamamina CTE diyorduk  ancak exception konusu ile birlikte
        compile Time Exception kavrami da hayatimiza girdi
         */
    }
}
