package day19_doWilelop;

public class C03_doWhileloop {
    public static void main(String[] args) {
        //kullanıcıdan pozitif  whileloop ile sayidan küçük pozitif
        // sayıları yazalım

        int input=3;

        int sayi=1;


        while(sayi<input){
            System.out.println(sayi);
            sayi++;
        }
        //aynı sayıyı do while ile yapalım
        sayi=1;

        do {
            System.out.println(sayi);
            sayi++;

        }while(sayi<input);
    }
}
