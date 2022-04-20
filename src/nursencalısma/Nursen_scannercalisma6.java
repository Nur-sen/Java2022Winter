package nursencalısma;

import java.util.Scanner;

public class Nursen_scannercalisma6 {
    public static void main(String[] args) {
        //Kullanicidan ismini alip isminin bas harfini yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("isminizi yaziniz");
        char ilkHarf=scan.next().charAt(0);
        System.out.println("girdiginiz ismin ilk harfi:"+ilkHarf);



    }
}
