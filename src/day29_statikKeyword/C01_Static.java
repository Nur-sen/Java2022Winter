package day29_statikKeyword;

public class C01_Static {
    String okulIsmi="yildiz Koleji";
    static String okulTelefonu="123456789";

    public static void staticMethod(){
        System.out.println("static Methot calisti");
    }

    public void staticOlmayanMethot(){
        System.out.println("Static olmayan method calisti");
    }
}
