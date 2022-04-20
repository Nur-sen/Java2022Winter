package day12_stringManipulation;

public class C04_replace {
    public static void main(String[] args) {

        String str="java ogrenmek cok kolay";

        System.out.println(str.replace('a','x'));
        String str1="bugün ne cok sey ogrendik";

        // bu cümledeki bosluk dısındaaki karakter sayısını bulunuz

        System.out.println("space haric karakter sayısı :"+ str.replace("", ""));

        // atama yapılmadığı sürece orjinal String kalıcı olarak değişmez
        //sadece satir için degişiklik yapıp sonuc yazdırmış oluruz

        System.out.println("orjinar str karakter sayısı : " +str1.length());

        str1=str1.replaceAll("bugün","yarın");
        str1=str1.replaceAll("ogrendik","ogrenecegiz");

        System.out.println("kalıcı degiğisiklikten sonra :" + str1);
        str.replaceAll("ne cok","ne az");
        System.out.println(str1);



    }
}
