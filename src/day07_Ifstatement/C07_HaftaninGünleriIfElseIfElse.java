package day07_Ifstatement;

import java.util.Scanner;

public class C07_HaftaninGünleriIfElseIfElse {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
       // eger kullanici gun ismini yanlisse "yanlis giris" yazdırın
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici


        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen gün ismi girin");
        String günIsmi=scan.next();

        if (günIsmi.equals("pazar") || günIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gün haftasonu");
        }

        else if(günIsmi.equals("pazartesi") || günIsmi.equals("sali") || günIsmi.equals("carsamba") ||
                günIsmi.equals("persembe") || günIsmi.equals("cuma")) {
            System.out.println("girdiginiz gün hafta ici");
        }
        else {
            System.out.println("yanlıs giris");
        }

        // eger if else if ..... statement else ile bitiyorsa
        // olasiliklardan sadece bir tanesi mutlaka calişir
        // Java ilk buldugu true 'a sonucu yazdırır
        // ve kalan sartlara bakmaz

        // if else if cümleleri else ile bitmese bile calisir
        // sadece bir olasilik calisabilir veya hic bir islem yapmayabilir



    }

}
