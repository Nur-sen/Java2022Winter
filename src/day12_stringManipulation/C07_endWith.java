package day12_stringManipulation;

public class C07_endWith {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        //        // mail @gmail.com
        //        //icermiyorsa “lutfen gmail adresi giriniz”,
        //        // @gmail.com ile bitiyorsa “Email adresiniz
        //        //kaydedildi “
        //        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
        String email="nursenalkan@gmail.com";
        String arananMetin="@gmail.com";
        if(!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz");
        }else if(email.endsWith(arananMetin)){
            System.out.println("Email adresiniz kaydedildi ");
        }else {
            System.out.println("lutfen yazımı doğru girin");
        }
    }
}

