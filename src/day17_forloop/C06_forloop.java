package day17_forloop;

public class C06_forloop {
    public static void main(String[] args) {
        //verieln 2 harf ve aralarindaki harflaeri yazdiran
        // bir kod yaziniz

        char ilkHarf='a';
        char sonHarf='m';

        for (char i = ilkHarf; i <=sonHarf ; i++) {
            System.out.print(i + " ");

        }

        double baslangic=10;
        double bitis=20;
        double artis=0.2;

        // baslangic ve bitis arasindaki artis miktari ile olacak tüm sayilari
        // yazdirin

        for (double i = baslangic; i <=bitis ; i+=artis) {

            System.out.print(i + " ");

        }

    }
}
