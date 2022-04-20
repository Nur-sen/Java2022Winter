package day41_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args) {
        /*
        bir cod yazilirken olasi exception'lar on gorulup exception olusturuldugunda
         Javanin ne yapmasini istedigimiz belirtilmelidir

         1-eger exception olustugunda kodun calismaya devam etmesini istemiyorsak
         method isminin yanina olusabilecek exception'i deklare edebiliriz
         2-eger exception olussa da kodun calismaya devam etmesini istiyorsak sorun olusturabilecek
         kodu try cath bulugunun icine aliriz
         try bloguna sorun cikabilecek kodu
        caht bloguna olusabilecek exception'i ve olasi exception durumunda
        Javanin ne yapmasini istedigimizi yazabiliriz
         */

        String dosyaYolu="src/day41_Exception/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
