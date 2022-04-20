package nursencalısma;

import java.util.Scanner;

public class Nursen_IfDiniGunler {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
        //gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
        //ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün girin");
        String gun= scan.next().toUpperCase();

        if(gun.equals("CUMA")){
            System.out.println("müslümanlar icin kutsal gün");
        }
        if(gun.equals("CUMARTESİ")){
            System.out.println("Yahudiler İcin Kutsal Gun");
        }
        if (gun.equals("PAZAR")){
            System.out.println("Hiristiyanlar İcin KUtsal Gun");

        }
    }
}
