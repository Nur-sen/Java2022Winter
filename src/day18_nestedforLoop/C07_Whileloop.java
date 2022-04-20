package day18_nestedforLoop;

import java.util.Scanner;

public class C07_Whileloop {
    public static void main(String[] args) {

        //kullanıcıdan kac sayi toplamak istediğini alın
        //bu sayiları alin ve bu sayiların toplamını ekrana yazdırın

        int sayiadeti=3;
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        for (int i = 1; i <=sayiadeti ; i++) {
            System.out.println("lütfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;

        }
        System.out.println("girilen " + sayiadeti + "sayinin toplami : " + toplam);

        //while ile yapsak
        sayi=0;
        toplam=0;
        int sayac=1;
        while (sayac<=sayiadeti){
            System.out.println("lütfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;
        }System.out.println("girilen " + sayiadeti + "sayinin toplami : " + toplam);
    }

}
