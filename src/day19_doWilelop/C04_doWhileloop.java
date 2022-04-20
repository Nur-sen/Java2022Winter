package day19_doWilelop;

import java.util.Scanner;

public class C04_doWhileloop {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        // ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        // yanlislikla kac negative sayi
        //girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int sayacPozitif=0;
        int sayacNagatif=0;

        do {
            System.out.println("lütfen pozitif bir tam sayi girin \nbitirmek için 0 a basın");
            sayi=scan.nextInt();
            if(sayi<0){
                System.out.println("negatif sayi giremezsin");
                sayacNagatif++;
            }else if(sayi>0){
                toplam+=sayi;
                sayacPozitif++;
            }
        } while(sayi!=0);
        System.out.println("yanlışlıkla girilen negatif sayi adeti : " + sayacNagatif);
        System.out.println("girilen pozitif sayı adeti : " + sayacPozitif);
        System.out.println("girilen pozitif sayilarin toplami : " + toplam );
    }
}
