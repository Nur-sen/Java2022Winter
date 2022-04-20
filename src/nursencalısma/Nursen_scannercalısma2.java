package nursencalısma;

import java.util.Scanner;

public class Nursen_scannercalısma2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
        //prizmanin hacmini hesaplayip yazdirin

        System.out.println("uzun kenari girin");
        int uzunKenar=scan.nextInt();
        System.out.println("kısa kenari girin");
        int kisaKenar=scan.nextInt();
        System.out.println("yüksekligi girin");
        int yükseklik= scan.nextInt();
        System.out.println("diktörgenler pirizmasının hacmini hesaplayın:"+(uzunKenar* kisaKenar* yükseklik));
      //  Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
     //Isminiz : Mehmet
    //Soyisminiz : Bulut
    //Kursumuza katiliminiz alinmistir,tesekkur ederiz


    }
}
