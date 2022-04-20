package nursencalısma;

import java.util.Scanner;

public class Nursen_CalismaRakamlarinToplami {
    public static void main(String[] args) {

        // Kullanıcıdanaldıgınız 3 basamaklı bir tamsayının rakamları toplamını bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 3basamaklı bir sayı girin");
        int sayi = scan.nextInt();

        int rakam = 0;
        int rakamlarToplami = 0;

        rakam = sayi % 10;
        rakamlarToplami += rakam;
        sayi /= 10;

        rakam = sayi % 10;
        rakamlarToplami += rakam;
        sayi /= 10;

        rakam = sayi % 10;
        rakamlarToplami += rakam;
        sayi /= 10;

        System.out.println("girdiginiz 3 basamaklı tam sayının rakamları toplamı:" + rakamlarToplami);
    }
}
