package day11_stringManipolation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str="Java Guzeldir";

        // Biz strin methodlarını arka arkaya kullanabiliriz
        //mesala ikinci kelimenin ilk harfini kucuk olarak yazdıralım

        //str.charAt(5); böyle yazdığımızda sonuc artık string degil char olacaktır
        // dolayısıyla stringte yapmak istediğimiz tüm değişiklikleri önce yapıp
        // sonra charAt metodunu kullanmalıyız
        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));

    }
}
