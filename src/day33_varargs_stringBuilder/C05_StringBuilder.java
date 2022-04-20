package day33_varargs_stringBuilder;

public class C05_StringBuilder {
    /*
    Compare iki sb'i esit mi diye kontrol etmek icin
    ilk harften baslayarak tum karakterleri karsilastirir
    Ayni olan karakterler icin bir sey yazdirmaz
    farkli olan ilk karakter icin ascii tablosuna gore kac degergeride veya
    ileride oldugunu yazdirir
    tamamen ayni ise bize 0 dondurur

    bir stringbuilder ile bir stringi compare etmek istersek java CTE verir
     */
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Ali Can");

        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2));//

        //Sb da equals  methodu String== gibi calisir

        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(sb1));//true

        System.out.println(sb1.equals(str));//false

        //System.out.println(sb1==str);//farkli obje turleri oldugu icin karsilastirma yapmaz



    }
}
