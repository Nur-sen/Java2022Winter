package NursenCalisma2;

import java.util.Scanner;

public class Whileloop2 {
    public static void main(String[] args) {

        //kullanıcıdan kac sayi toplamak istediğini alın
        //bu sayiları alin ve bu sayiların toplamını ekrana yazdırın


        int sayiAdeti=5;
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;


        for (int i = 1; i <=sayiAdeti ; i++) {
            System.out.println("lütfen bir sayi girin");
            sayi= scan.nextInt();
            toplam+=sayi;

        }
        System.out.println("girilen "+sayiAdeti + "sayilarin toplami :"+toplam);

        //while ile yapalım

        sayi=0;
        toplam=0;
        int sayac=1;
        while (sayac<=sayiAdeti){
            System.out.println("lütfen bir sayi girin");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;
        } System.out.println("girilen "+sayiAdeti + "sayinın toplami :" + toplam);
    }
}
