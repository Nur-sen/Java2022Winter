package day10_Switch_StringManipulation;

import java.util.Scanner;

public class C01_switchCase {
    public static void main(String[] args) {
        //kullanııdan sayı olarak kacıncı ay numarasını alıp
        //istnen ay ismini yazdıran bir program yazınız

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen kacıncı ay oldugunu girin");
        int ayNo=scanner.nextInt();

        // bu soruyu if else ile yapabiliriz ama art arada 12 tane if else
        // cok kalabalık ve anlaşılması guc olur
        // bunun yerine switch case yapısını kullanabiliriz

        switch (ayNo){

            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("lütfen gecerli bir ay numarası giriniz");



        }
        // switch icine yazılan varaiblenın degerine göre
        //ilgili case bulur ve break görene kadar kodu calıştırır
        // eger break yoksa ilgili case den asağı dogru tüm caseler calısır
        // if else deki son else gibi geriye kalan durumları tamamen
        // kapsayacak bir satır eklenir.==> buda default yazılır
    }
}
