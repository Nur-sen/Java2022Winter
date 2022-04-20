package day05_matematikselislemler;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        sayi2=sayi1++;
        System.out.println(sayi1+","+ sayi2+  ","+ sayi3);
// arada , varsa toplama yapılmaz

        sayi3=++sayi1;

        System.out.println(sayi1+","+ sayi2+  ","+ sayi3);
        System.out.println(sayi3++);
        System.out.println(sayi3);
        System.out.println(--sayi2);//önce azalt sonra yazdır
                                    // 9
        System.out.println(sayi2--);
        System.out.println(sayi2);







    }
}
