package day40_Overriding_Polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exception {
    /*
    kullanicidan istedigi kadar sayi alip toplayan bir program yaziniz
    topplam 500'u gerse programi bitirsin veya
    kullanici bitirmek istediginde Q ya bassin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        do {
            System.out.println("toplamak istediginiz sayiyi giriniz \nbitirmek icin Q'ya basin");
            int sayi= 0;


            try {
                sayi = scan. nextInt();
                toplam+=sayi;
            } catch (InputMismatchException e) {
                String  hataliGiris=scan. next();
                if(hataliGiris.equalsIgnoreCase("q")){

                    System.out.println("Girdiginiz sayilarin toplami : " + toplam);
                    break;
                }else{
                    System.out.println("Hatali giris");
                }

            }



        } while(toplam<500);


    }
}
