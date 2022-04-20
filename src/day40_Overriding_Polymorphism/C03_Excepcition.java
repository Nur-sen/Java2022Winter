package day40_Overriding_Polymorphism;

import java.util.Scanner;

public class C03_Excepcition {
    /*
    kullanicidan iki sayi alip bolerek yazdiran bir program yapiniz
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int kontrol=0;
        
         while(kontrol!=2){  System.out.println("Bolmek istediginiz sayiyi yazin");
             int sayi1=scan.nextInt();

             System.out.println("kaca bolmek istediginiz  yazin");
             int sayi2=scan.nextInt();
             try {
                 System.out.println("sonuc: " + sayi1/sayi2);
             } catch (Exception e) {
                // e.printStackTrace();
                 System.out.println("girdiginiz sayilarda sorun var");
             }
             System.out.println("devam etmek icin 1\nbitirmek icin 2'e basin ");
             kontrol=scan.nextInt();
        }


       /*
       sayi2 0 oldugunda sayi1/0 tanimsiz olacagindan
       Java bu durumda exception verir
       Javanin yazdigi mesajda exception ne tur sorun oldugunu
       neden kaynaklandigi
       ve hangi satirda olustugu yazar
       Exception in thread "main" java.lang.ArithmeticException: / by zero
	   at day40_Overriding_Polymorphism.C03_Exepcition.main
	   (C03_Exepcition.java:18)

	   bunu cozmek icin sayi2 yi if ile kontrol edebiliriz


        if(sayi2==0){
            System.out.println("sayi / 0 tanimsizdir");
        }

        else{
            System.out.println("sonuc: " + sayi1/sayi2);
        }

        ama bu yontem her sorunda calismaz
        */


    }
}
