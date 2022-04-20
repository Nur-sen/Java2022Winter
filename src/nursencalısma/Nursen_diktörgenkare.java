package nursencalısma;

import java.util.Scanner;

public class Nursen_diktörgenkare {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        //olmadigini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("diktörgenin kenar uzunluklarını girin");
        int kenar1 = scan.nextInt();
        int kenar2= scan.nextInt();

        if(kenar1!=kenar2){
            System.out.println("diktörgendir");

        }
        if(kenar1==kenar2){
            System.out.println("karedir");
        }





    }
}
