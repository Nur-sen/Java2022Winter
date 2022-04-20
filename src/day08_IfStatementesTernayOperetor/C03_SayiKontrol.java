package day08_IfStatementesTernayOperetor;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {
        //Soru 6) Kullanicidan iki sayi isteyin,
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        //sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        // sayilarin ikisi farkli
        //isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        //sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen iki sayi giriniz");
        //int de olabilir fakat double yazarsak küsüratli sayida yazilabilir
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        if(sayi1>0 && sayi2>0){
            System.out.println("girdiginiz iki sayi da pozitif oldugunda toplamları= "+
                    (sayi1+sayi2));
        }

        else if(sayi1<0 && sayi2<0){
            System.out.println("girdiginiz iki sayi da negatif oldugunda carpimlari= "+
                    (sayi1*sayi2));
        }
        else if( sayi1<0 && sayi2>0){
            System.out.println("farkli isaretlerdeki sayilarla islem yapamazsin");
        }

        else {
            System.out.println("sıfır carpmaya göre yutan elemandir");
        }


    }
}
