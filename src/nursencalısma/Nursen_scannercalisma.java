package nursencalısma;

import java.util.Scanner;

public class Nursen_scannercalisma {
    //kullanicidan iki tasayı alip bu sayilarin toplam,fark ve carpımlarını yaziniz.
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("sayi1 giriniz");
        int sayi1 =scan.nextInt();

        System.out.println("sayi2 giriniz");
        int sayi2 =scan.nextInt();
        System.out.println("iki tam sayinin toplamini:"+(sayi1+sayi2));

        System.out.println("iki tam sayinin farki:"+(sayi1-sayi2));
        System.out.println("iki tam sayinin carpımı:"+(sayi1* sayi2));
        //Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
        //prizmanin hacmini hesaplayip yazdirin

        System.out.println("uzun kenari girin");
        int uzunKenar=scan.nextInt();
        System.out.println("kısa kenari girin");
        int kisaKenar=scan.nextInt();
        System.out.println("yüksekligi girin");
        int yükseklik= scan.nextInt();
        System.out.println("diktörgenler pirizmasının hacmini hesaplayın:"+(uzunKenar* kisaKenar* yükseklik));


    }
}
