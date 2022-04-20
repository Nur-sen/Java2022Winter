package nursencalısma;

import java.util.Scanner;

public class Nursen_CiftTekSayi {
    public static void main(String[] args) {
        //  Soru 1) Kullanicidan bir tamsayi isteyin
        //  ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tamsayi girin");
        int sayi= scan.nextInt();
        if(sayi%2==0) {
            System.out.println("girilen sayi cift sayidir");
        }
        if(sayi%2!=0){
            System.out.println("girilen sayi tek sayidir");
        }



    }
}
