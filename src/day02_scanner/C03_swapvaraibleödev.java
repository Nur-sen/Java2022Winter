package day02_scanner;

public class C03_swapvaraibleödev {

    /*
    1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
    ucuncu bir variable kullanmadan degistiren (SWAP)
    bir program yaziniz
     Orn    : sayi1=10 ve sayi2=20;
      kod calistiktan sonra
     sayi1=20 ve sayi2=10
     */
     public static void main(String[] args) {
         int sayi1=10;
         int sayi2=20;
         System.out.println("swaptan önce sayi1:"+ sayi1+ " "+ ",sayi2:"+ sayi2);
         sayi1=sayi1+sayi2;// sayi1=30
         sayi2=sayi1-sayi2; //sayi2=10
         sayi1=sayi1-sayi2;//sayi1=20
         System.out.println("swaptan sonra sayi1:"+ sayi1+" "+ ",sayi2:"+ sayi2);


     }

}
