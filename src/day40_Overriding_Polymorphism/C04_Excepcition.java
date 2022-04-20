package day40_Overriding_Polymorphism;

public class C04_Excepcition {
    public static void main(String[] args) {
         /*
    String olrak verilen bir sayiyi integer'e cevirip
    2 katini ekrana yazdiralim
     */

        String str="12345a";


        /*
        str icinde sayi olmayan bir karakter olursa
        .NumberFormatException.forInputString verir
         */

        try { int sayi=Integer.parseInt(str);
            System.out.println("girilen sayinin iki kat : "+ 2*sayi);
        } catch (Exception e) {
            //e.printStackTrace();

            System.out.println("girdiginiz string sayi olmayan elementler iceriyor");}


    }
}
