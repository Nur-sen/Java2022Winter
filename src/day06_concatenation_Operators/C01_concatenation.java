package day06_concatenation_Operators;

public class C01_concatenation {

    public static void main(String[] args) {


        String  str1="Java";
        String  str2="Guzel";
        int sayi1=5;
        int sayi2=3;

        System.out.println(str1+sayi1+str1);

        // 2Guzel15
        System.out.println(sayi1-sayi2+str1+sayi1*sayi2);

        // Java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));

        //53Guzel
        System.out.println(sayi1+(sayi2+str2));

        System.out.println(""+sayi1+sayi2+str2);

        // eger tamamen sayilardan olusan bir string varsa ve biz bunu int a cevirmek
        // istersek Integer.volueof(str)
        // bir sayiyi stringe cevirmek için basına "" ekleriz


    }
}
