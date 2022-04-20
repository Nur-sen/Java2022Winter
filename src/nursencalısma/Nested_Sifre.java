package nursencalısma;

import java.util.Scanner;

public class Nested_Sifre {

    public static void main(String[] args) {
        //Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        //Kullanicidan bir sifre girmesini isteyin
        //Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
        // Ilk harf A ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
        //Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gecerli bir sifre girin");
        String sifre=scan.next();
        char ılkHarf=sifre.charAt(0);




        if(ılkHarf>='A'&&ılkHarf<='Z'){
            if(ılkHarf=='A')
            {
                System.out.println("Gecerli sifre");
            }
           else{
                System.out.println("Gecersiz sifre");
            }

        }
        else{
            if(ılkHarf=='z')
            {
                System.out.println("Gecerli sifre");
            }
            else{
                System.out.println("Gecersiz sifre");
            }

        }


    }
}
