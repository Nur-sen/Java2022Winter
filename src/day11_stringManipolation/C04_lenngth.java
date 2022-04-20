package day11_stringManipolation;

import java.util.Locale;
import java.util.Scanner;

public class C04_lenngth {
    public static void main(String[] args) {
        // kullanıcıdan ismini alıp bas harfini ve son harfini
        //büyük harfle yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi girin");
        String isim=scan.next();

        System.out.println("ilk Harf :" +
                isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf :" +
                isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));
        String str="";
        System.out.println(str.length());// 0
        String str1=null;
        System.out.println(str1);
       // System.out.println(str1.length()); // calıstıgında hata veriri
        String str2;
        //System.out.println(str2);
        //str2 ile str1 e  deger atanmaıştır
        // str1 null pointer ile isaretlendiğinde java durumun kontrol altında
        // oldugunu bilir ve geriye kalan kodun calışmasına engel olmaz
        // ancak str2 e bir deger ataması olmayınca java altını kırmızı çizer
        // burum düzelinceye kadar kodun geriye kalanını calıştırmaya izin vermez



    }
}
