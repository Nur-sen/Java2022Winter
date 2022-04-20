package day20_scope_arrays;

public class C01_Scope {

    int sayi;
    String bransIsmi="Java";
    boolean okuldaMi;

    public static void main(String[] args) {
        //sayi=10; sayi varaible i static olmadığı için main metthod'dan direk
        //kullanılmaz
        //instance variable lara static methodlardan ulasabilmek icin obje olusturulmalı

        C01_Scope obje1=new C01_Scope();
        System.out.println(obje1.sayi);//0
        obje1. sayi=10;
        System.out.println(obje1. sayi);//10
        obje1.bransIsmi="SQL";
        System.out.println(obje1.okuldaMi);

        C01_Scope obje2=new C01_Scope();
        System.out.println(obje2.sayi);//0
        System.out.println(obje2.bransIsmi);//Java

        obje1.okuldaMi=true;
        System.out.println(obje2.okuldaMi);//false





    }
}
