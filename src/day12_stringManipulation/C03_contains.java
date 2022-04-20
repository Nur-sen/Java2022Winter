package day12_stringManipulation;

public class C03_contains {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com
        //icermiyorsa “lutfen gmail adresi giriniz”, @gmail.com ile bitiyorsa “Email adresiniz
        //kaydedildi “
        //, @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin


        String email ="nursenalkan@gmail.com";
        String arananMetin="@gmail.com";

        if(!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz");
        }else if(email.lastIndexOf(arananMetin)==(email.length()-10)){
            System.out.println("Email adresini kaydedildi");

        } else {
            System.out.println("lutfen yazımı kontrol edin");
        }
    }
}
