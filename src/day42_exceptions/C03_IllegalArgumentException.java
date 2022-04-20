package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {
        /*
        Kullanicidan yasini isteyin
        kullanici yas olarak negatif bir sayi,0 veya 120 den
        buyuk bir sayi girerse illegalArgumentException
        olacak sekilde program yazin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi girin: ");
        int yas=scan.nextInt();

        if(yas<=0 || yas>120){
            //System.out.println("lutfen gecerli bir yas giriniz");
            //java bizim istedigimiz durumlarda exception firlatabilir
            throw new IllegalArgumentException();
        } else {
            System.out.println("uygun bir yas girdiniz, tesekkurler");
        }
    }
}
