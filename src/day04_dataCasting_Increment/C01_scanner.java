package day04_dataCasting_Increment;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class C01_scanner {
    // kullanicidan isim alma
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen isminizi girin");
        char ilkHarf= scan.next().charAt(0);
        System.out.println("girdiginiz ismin ilk harfi:"+ ilkHarf);
    }
}
