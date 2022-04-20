package NursenCalisma2;

import java.util.Scanner;

public class nursen_replaceAll {
    public static void main(String[] args) {
        //kullanıcıdan isim-soyisim bilgisi alıp
        //bütün harfleri * ile degiştirin

        Scanner scan=new Scanner(System.in);
        System.out.println("isim ve soyisminizi girin");
        String isimSoyisim= scan.nextLine();
        System.out.println(isimSoyisim.replaceAll("\\S","*"));



    }
}
