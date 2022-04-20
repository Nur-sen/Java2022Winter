package day05_matematikselislemler;

public class C01_ {
    public static void main(String[] args) {
        int sayi=10;
        sayi++;
        System.out.println(sayi);

        sayi++;
        System.out.println( "pre-incerementten önce" + sayi);
        //eger 10. ve 11. satirda yaptıgım 2 islemi tek satırda yaparsam
        // java islemden önce hangisini yaptıgını bilmek ister
        // önce artırır sonra yazdırırsak java yeni degeri yazdırırlır
        // ama önce yazdırır sonra artırırsak bu durumda eski egeri yazar

        System.out.println("preincerement satırında " + ++sayi);// önce artır sonra yazdır 13

        System.out.println( "pre- incerementten sonra " +sayi);
        System.out.println("post- increment satirinda "+ sayi++);
        System.out.println(" post-increment satırından sonra "+sayi);




    }
}
