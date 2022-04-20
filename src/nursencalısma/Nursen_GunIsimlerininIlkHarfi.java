package nursencalısma;

import java.util.Scanner;

public class Nursen_GunIsimlerininIlkHarfi {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
        //isimlerini yazdirin
        //Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
        //ilkHarf=S output = “Sali”
        //*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin

        Scanner scan=new Scanner(System.in);
        System.out.println("gun isimlerinden birirnin ilk harfini girin");

        char ilkHarf= scan.next().toUpperCase(). charAt(0);

        if(ilkHarf=='P')
        {
            System.out.println("Gun ismi:"+"Pazartesi"+" " +"Perşembe"+" "+"Pazar");
        }
        if(ilkHarf=='S'){
            System.out.println("Gun ismi:"+"Sali");

        }
        if(ilkHarf=='C'){
            System.out.println("Gun ismi:"+" "+"Carsamba"+" "+ "Cuma"+" " +"Cumartesi");

        }




    }




}
