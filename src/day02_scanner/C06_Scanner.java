package day02_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {
        // Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
        //      Isim – soyisim :Nursen ALKAN
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi girin");
        String isim= scan.nextLine();
        System.out.println("lütfen soyisminizi girin");
        String soyisim= scan.nextLine();
        System.out.println("isim-soyisim:"+ isim +" "+ soyisim);



    }
}
