package day18_nestedforLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //kulanicidan 2 tam sayi alıp
        //bu sayilari ve aralarindaki tüm sayilari
        //yazdiran bir kod olusturun


        int baslangıc=40;
        int bitis=60;


        for (int i = baslangıc; i <= bitis; i++) {
            System.out.print(i+ " ");

        }
        System.out.println("");
        //whileloop ile yapalim
        int i=baslangıc;
        while (baslangıc<=bitis){

            System.out.print(baslangıc + " ");
            baslangıc++;

        }
        System.out.println("");


    }
}
