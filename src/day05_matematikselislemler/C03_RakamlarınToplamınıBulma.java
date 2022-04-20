package day05_matematikselislemler;

import java.util.Scanner;

public class C03_RakamlarınToplamınıBulma {
    public static void main(String[] args) {
        //kullanıcıdan aldıgınız 4 basamaklı bir sayının basamaklardaki rakamlar toplamını bulunuz


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 4 basamaklı bir tam sayi girin");
        int sayi= scan.nextInt();

        int rakam=0;
        int rakamlarToplamı=0;

        //1. adım r=0 rakamlar toplamı=0 sayi=7532

        rakam=sayi%10; //2
        rakamlarToplamı +=rakam;//2
        sayi/=10;//753

        //2. adıma gecince r=2 rt=2 sayi=753

        rakam=sayi%10; //3
        rakamlarToplamı +=rakam;
        sayi/=10;//

        //3.adım r=3 rt=3 sayi=75;

        rakam=sayi%10;//5
        rakamlarToplamı +=rakam;
        sayi /=10;//7

        rakam=sayi%10;//7
        rakamlarToplamı +=rakam; //17
        sayi/=10; //0

        System.out.println("girdiginiz sayının rakamlar toplamı"+rakamlarToplamı);




    }
}
