package day19_doWilelop;

public class C02_Whileloop {
    public static void main(String[] args) {
        // kullanıcıdan bir sayi alın ve
        //bu sayinin rakamlari toplamını yazdırın

        int input =12123;
        int rakam=0;
        int rakamlarToplami=0;

        while(input>0){
            rakam=input%10;
            rakamlarToplami+=rakam;
            input/=10;

        }
        System.out.println(rakamlarToplami);
    }
}
