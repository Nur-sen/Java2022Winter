package nursencalısma;

import java.util.Scanner;

public class NestedIfElse_Emekli {
    public static void main(String[] args) {
        //Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli
        //olabilir, calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinisi giriniz: "+ "\nKadın \nErkek");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        double yas=scan.nextDouble();
        if(cinsiyet=='K'){
            if(yas>0 || yas<60){
                System.out.println("Emekli olamasiniz");
            }else if(yas<100 || yas>=60){
                System.out.println("Emekli olabilirsiniz");

            }
            else{
                System.out.println("lütfen gecerli bir deger girin");
            }

        }else if(cinsiyet=='E'){
            if(yas>0 || yas<65) {
                System.out.println("Emekli olamazsiniz");
            }
                else if(yas<100 || yas>=65){
                System.out.println("Emekli olabilirsiniz");
                }else if(yas<0 || yas>100){
                System.out.println("lütfen dogru bir deger giriniz");
            }
                else{
                System.out.println("lütfen cinsiyet icin dogru bir harf girin");
            }

        }

    }
}
