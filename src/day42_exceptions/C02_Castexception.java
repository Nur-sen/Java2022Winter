package day42_exceptions;

public class C02_Castexception {
    public static void main(String[] args) {
        int sayi=10;
        //String str=sayi; CTE teknik olarak mumkun degil

        Object str3="Java cok guzel";
        String str4=(String) str3;
        System.out.println(str4);//Java cok guzel


        Object sayi2=20;

        String str2=(String)sayi2;//Explicit Norrowing
                                  //ClassCastException

    }
}
