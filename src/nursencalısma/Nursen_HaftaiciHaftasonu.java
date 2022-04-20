package nursencalısma;

import java.util.Scanner;

public class Nursen_HaftaiciHaftasonu {
    public static void main(String[] args) {
     //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //Ornek: gun=Pazar output = “Hafta sonu”
        //gun=Sali output = “Hafta ici”
        //*** String icin equals method’unu kullanin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismi girin");
        String gunIsmi= scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESİ")){
            System.out.println("girdiniz gün ismi hafta sonu");

        }
        if (gunIsmi.equals("PAZARTESİ") || gunIsmi.equals("SALI") || gunIsmi.equals("CARSAMBA") ||
        gunIsmi.equals("PERSEMBE") || gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gün ismi hafta ici");
        }



    }
}
