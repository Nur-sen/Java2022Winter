package nursencalısma;

import java.util.Scanner;

public class Nursen_scanner3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("kaenin bir kenar uzunlugunu girin");
        int kenarUzunlugu= scan.nextInt();
        System.out.println("bir karenin alani:"+(kenarUzunlugu*kenarUzunlugu));
        System.out.println("bir karenin cevesi:"+(kenarUzunlugu+kenarUzunlugu+kenarUzunlugu+kenarUzunlugu));
    }
}
