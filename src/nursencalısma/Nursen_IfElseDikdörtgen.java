package nursencalısma;

import java.util.Scanner;

public class Nursen_IfElseDikdörtgen {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        //olmadigini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("dikdörgenin kenar uzunlıklarını girini");
        int uzunKenar=scan.nextInt();
        int kisaKenar= scan.nextInt();

        if(uzunKenar!=kisaKenar){
            System.out.println("dikdörtgendir");
        }
        else {
            System.out.println("karedir");
        }
    }
}
