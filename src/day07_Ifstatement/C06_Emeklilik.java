package day07_Ifstatement;


import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        //kullanicidan yasini isteyin 65 ve daha büyükse emekli olabilirsin
        // eger 65 den kücüksen emekli olamasın

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen yasinisi girin");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");

        }
        else {
            System.out.println("emekli olamazsin");
            System.out.println(65- yas + " " + "yil sonra emekli olabilirsin");
        }

        // if else statement' lerde sadece biri calisir
        //ikisinide ayni anda calişma yada ikisininde ayni anda calismama durumu yok




    }
}
