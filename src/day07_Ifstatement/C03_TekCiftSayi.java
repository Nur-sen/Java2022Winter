package day07_Ifstatement;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir tamsayi girin");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("girilen sayi cift sayidir");

        }
        if(sayi%2!=0) {
            System.out.println("girilen sayi tek syidir");
        }

        // bir sayi ya tektir yada cifttir ücüncü bir secenek yoktur
        //o zaman tek yada cift olmasini iki ayri if le değilde
        // if else 'yle tek statemente yapmak daha iyi olur
        //##### if else ile cözüm
        if(sayi%2==0){
            System.out.println("girdiginiz sayi ciftir");
        } else {
            System.out.println("girdiginiz sayi tektir");
        }





    }
}
