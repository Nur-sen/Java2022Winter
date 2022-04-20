package NursenCalisma2;

import java.util.Scanner;

public class DoWhileLoop5 {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        // ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        // yanlislikla kac negative sayi
        //girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        int sayi=1000;
        int toplam=0;
        int sayacpozitif=0;
        int sayacNegatif=0;

        do {
            System.out.println("lütfen pozitif bir sayi girin \nbitirmek icin 0'a basin ");

            sayi= scan.nextInt();
            if(sayi<0){
                System.out.println("negatif bir sayi giremezsiniz");
                sayacNegatif++;
            } else if(sayi>0){
                toplam+=sayi;
                sayacpozitif++;

            }
        } while(sayi!=0);{
            System.out.println();
            System.out.println("Girilen pozitif tamsayilarin toplami : " + toplam);

        }

    }
}
