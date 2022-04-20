package NursenCalisma2;

public class DoWhileloop {
    public static void main(String[] args) {
        //kullanıcıdan  pozitif bir tamsayı alıp
        // while loop ile sayidan  kücük pozitif tamsayilari yazdiralim


        int input=3;
        int sayi=1;

        while (sayi<input){
            System.out.println(sayi);

            sayi++;
        }
        // aynı soruyu do while loop ile yapalım
        sayi=1;

        do {
            System.out.println(sayi);
            sayi++;
        }while(sayi<input);{


        }


    }
}
