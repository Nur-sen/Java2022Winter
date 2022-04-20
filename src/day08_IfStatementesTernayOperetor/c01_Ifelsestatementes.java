package day08_IfStatementesTernayOperetor;

import java.util.Scanner;

public class c01_Ifelsestatementes {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
        //olmadigini yazdirin
        Scanner scan =new Scanner(System.in);
        System.out.println("bir karakter girin");
        char karakter=scan.next().charAt(0);

        if((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')){
            System.out.println("Girdiginiz karakter harftir");

        }
        else {
            System.out.println("girdiginiz karakter harf degil");
        }


    }
}
