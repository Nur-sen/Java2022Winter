package nursencalısma;

import java.util.Scanner;

public class Nursen_scannercalisma4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz : Esat
        //Soyisminiz : Alkan
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz
        System.out.println("isminizi girn");
        String ismi= scan.nextLine();
        System.out.println("soyisminizi girin");
        String soyIsim= scan.nextLine();
        System.out.println("isim:"+ ismi);
        System.out.println("soyisim:"+ soyIsim);
        System.out.println("Kursumuza Kaydiniz Alinmistir.");



    }
}
