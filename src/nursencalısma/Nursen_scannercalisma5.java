package nursencalısma;

import java.util.Scanner;

public class Nursen_scannercalisma5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki
        //sekilde yazdirin
        //Isim – soyisim : Esat -Alkan

        System.out.println("isminizi girin");
        String isim= scan.nextLine();
        System.out.println("soyisminizi girin");
        String soyısim= scan.nextLine();
        System.out.println("isim - soyisim:"+" "+ isim+"-"+soyısim);
    }
}
