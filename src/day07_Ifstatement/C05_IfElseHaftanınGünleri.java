package day07_Ifstatement;

import java.util.Scanner;

public class C05_IfElseHaftanınGünleri {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün ismi girin");
        String günIsmi= scan.next().toUpperCase();

        if (günIsmi.equals("PAZAR") || günIsmi.equals("CUMARTESİ")){
            System.out.println("girdiginiz gün haftasonu");
        }
        else {
            System.out.println("girdiginiz gün hafta ici");
        }



    }
}
