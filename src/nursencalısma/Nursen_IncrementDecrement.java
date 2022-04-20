package nursencalısma;

public class Nursen_IncrementDecrement {
    public static void main(String[] args) {

        int sayi=20;
        System.out.println(sayi+10);//30
        System.out.println(sayi); // eger atama yapılmazsa sayıdaki degisiklik kalıcı olmaz
        sayi=sayi+10;
        System.out.println(sayi);
        System.out.println(sayi*=20);
        System.out.println(sayi-=20);
        System.out.println(sayi/=10);

    }
}
