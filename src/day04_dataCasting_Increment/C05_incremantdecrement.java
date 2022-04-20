package day04_dataCasting_Increment;

public class C05_incremantdecrement {
    public static void main(String[] args) {

        int sayi=20;
        System.out.println(sayi+10);// 30 bu satırda sayiyi 10artırmadım sayının 10fazlasını yazdım

        System.out.println(sayi);//20
        // eger atama yapmazsak sayida yaptıgımız artırma yada azaltma kalıcı olmaz
        sayi=sayi+10;

        System.out.println(sayi);

        System.out.println(sayi=sayi+10);//40
        System.out.println(sayi); //40
        System.out.println(sayi+=10);
        System.out.println(sayi);
        //bir varaible degerini kalıcı olarak artırıp azaltmak icin assigment sartir
        System.out.println("20.satir:"+sayi++);//50
        System.out.println("21.satir:"+sayi);//51
        System.out.println("22.satir:" + ++sayi);//52
        System.out.println("23.satir:"+sayi);//52




    }
}
