package day11_stringManipolation;

import java.util.Scanner;

public class C03_equalslgnorcase {
    public static void main(String[] args) {
        // kullanıcıya derse katılıp katılmak istemediğini
        // sorun evet derse cevabını "derse katılımınız sağlanmıştır" yazdırın
        // hayır ise cevabını ve "sobraki derse bekleriz" yazırın
        Scanner scan=new Scanner(System.in);
        System.out.println("Derse katılmak istermisiniz?\nEvet veya Hayır yazınız");
        String cevap=scan.next();

        if(cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabınız :" + cevap + " " + "derse katılımınız onaylanmıştır");

        }else if(cevap.equalsIgnoreCase("hayır")){
            System.out.println("cevabınız : " + cevap + " " + "sonraki derse bekleriz");

        }else{
            System.out.println("lütfen evet veya hayır giriniz");
        }

    }
}
