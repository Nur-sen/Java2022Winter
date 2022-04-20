package NursenCalisma2;

public class Whileloop {
    public static void main(String[] args) {
        //kulanicidan 2 tam sayi alıp
        //bu sayilari ve aralarindaki tüm sayilari
        //yazdiran bir kod olusturun
        
        int baslngıc=40;
        int bitis=60;

        for (int i = baslngıc; i <=bitis ; i++) {

            System.out.print(i + " ");
        }
        System.out.println("");
        // while loop
        int i=baslngıc;
        while(i<=bitis){

            System.out.print(i+ " ");
            i++;
        }
        System.out.println("");


    }
}
