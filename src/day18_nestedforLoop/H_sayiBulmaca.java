package day18_nestedforLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    // bilgisayara 1 ile 100 arasinda bir sayi tutturun
    // kullanicidan bu sayiyi tahmin etmesini isteyin
    // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
    // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu
    // kullaniciya yazdirin
    public static void main(String[] args) {
        Random rnd = new Random();
        int sayi=rnd.nextInt(100);//burası 100 den kucuk rastgele sayi olusturur


        Scanner scan=new Scanner(System.in);
        int tahmin=0;
        int sayac=0;


        while (sayi!=tahmin){
            System.out.println("lütfen sayi girin");
            tahmin=scan.nextInt();

            if(tahmin>sayi){
                System.out.println("daha kücük sayi girin");

            }else if(tahmin<sayi){
                System.out.println("daha büyük sayi girin");

            }sayac++;
        }
        System.out.println("tutugum sayiyi " + (sayac) + " tahminde bulundunuz");


    }


}
