package day07_Ifstatement;

import java.util.Locale;
import java.util.Scanner;

public class C04_haftaicihaftasonu {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin


        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        // string case sensitive dir
        // yani pazar, PAZAR,Pazar bunlarin hepsi farkli kelimelerdir
        // budurumda String methodlarindan yardim alinir.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün ismi girin");
        String günIsmi=scan.next().toLowerCase();

        if (günIsmi.equals("pazar") || günIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gün haftasonu");
        }

        if(günIsmi.equals("pazartesi") || günIsmi.equals("sali") || günIsmi.equals("carsamba") ||
                günIsmi.equals("persembe") || günIsmi.equals("cuma")) {
            System.out.println("girdiginiz gün hafta ici");
        }



        // string ifadelerde equals kullanılmasının nedeni string ifadelerde
        // == (esittir) kullanılması tercih edilmez.





    }
}
