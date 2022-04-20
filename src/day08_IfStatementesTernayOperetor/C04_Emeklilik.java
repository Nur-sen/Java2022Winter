package day08_IfStatementesTernayOperetor;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {
        //Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi yaziniz" +
                "\nkadin icin K \nErkek icin E harfini girin");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("lütfen yasinizi giriniz"); // kisi yasini küsüratli girmek isteyebilir
                                                        // o yüzden double yazmaliyiz
        double yas= scan.nextDouble();
        if(cinsiyet =='K'){
            if(yas<0 || yas>120){
                System.out.println("Lütfen girdiginiz degeri kontrol edin");
            }else if(yas<60){
                System.out.println("emekli olamasin\ndaha"+(60-yas)+"yil calisman gerkli");
            }else {
                System.out.println("emekli olabilirsin");
            }
        }   else if (cinsiyet=='E'){
            if(yas<0 || yas>120){
            System.out.println("Lütfen girdigin,iz degeri kontrol edin");
        }else if(yas<65){
            System.out.println("emekli olamasin\ndaha"+ (65-yas)+"yil calisman gerekli");
        }else {
            System.out.println("emekli olabilirsin");
        }

        }
        else {
            System.out.println("lütfen cinsiyet icin gecerli bir harf giriniz");

        }

    }
}
