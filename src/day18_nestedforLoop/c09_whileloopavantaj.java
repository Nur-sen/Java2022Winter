package day18_nestedforLoop;

import java.util.Scanner;

public class c09_whileloopavantaj {
    public static void main(String[] args) {
        //kullanıcıdan istediği kadar sayi girmesini isteyin
        //kullanıcının girdigi sayilarin toplamı 500 gecerse
        //artık yeter cok sayı girdin toplm .... oldu yazsın

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;



        while (sayi<500){
            System.out.println(" lütfen bir sayi girin");
            sayi= scan.nextInt();
            toplam+=sayi;

        }
        System.out.println("artık yeter cok sayi girdin, toplam : "+ toplam+ " oldu");
    }
}
