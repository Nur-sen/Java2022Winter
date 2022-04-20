package day02_scanner;

import java.util.Scanner;

public class C05_Scanner {
    // Soru 3) Kullanicidan yaricap isteyip cemberin
    // cevresini ve dairenin alanini hesaplayip yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cemberin yaricapini giriniz");

           double yaricap= scan.nextDouble();
        System.out.println("girdiginiz yaricap:"+yaricap);
        System.out.println("girdiginiz cemberin cevresi"+2*3.14);
        System.out.println("girdiginiz cemberin alani"+3.14*yaricap*yaricap);

    }
}
