package day09_ternary_Switch;

import java.util.Scanner;

public class C02_ternery {
    public static void main(String[] args) {

        //ternery ile yapılan tüm işlemler if else ile
        // yapılabilir if else yerine ternary seçmenin sebebi yapının basit ve anlasılabilir olmasıdır.
        // ternary icersinde kompleks sonuca götüren basit işlemlerdir

        // kullaıcıdan br tamsayı alıp tek mi çift mi yazdıran bir kod yazalım

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir pozitif bir tamsayi giriniz");
        int sayi =scan.nextInt();
        if(sayi%2==0){
            System.out.println("sayi çiftir");
        } else{
            System.out.println("sayi tektir");
        }
        System.out.println(sayi%2==0 ? "Sayi çiftir": "Sayı tektir");



    }


}
