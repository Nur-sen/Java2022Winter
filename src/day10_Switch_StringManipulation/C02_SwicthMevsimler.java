package day10_Switch_StringManipulation;

import java.util.Scanner;

public class C02_SwicthMevsimler {
    public static void main(String[] args) {
        // kullanıcılar kacıncı ay oldugunu alıp mevsimi yazdıran
        // bir swicth olusturun


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen kacıncı ay oldugunu girin");
        int ayNo=scanner.nextInt();



        switch (ayNo) {
            case 12:
            case 1:
            case 2:
                System.out.println("Kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;

            default:
                System.out.println("lütfen gecerli bir ay numarası giriniz");


        }
    }
}
