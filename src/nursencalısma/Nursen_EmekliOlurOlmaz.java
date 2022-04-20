package nursencalısma;

import java.util.Scanner;

public class Nursen_EmekliOlurOlmaz {
    public static void main(String[] args) {
        //Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin,
        //calismalisin”, 65’e esit veya buyukse “Emekli olabilirsin” yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yasinizi girin");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsiniz");
        }
        else{
            System.out.println("emekli olamazsınız");
            System.out.println(65-yas + " "+ "yıl sonra emekli olabilirsiniz");
        }


    }
}
