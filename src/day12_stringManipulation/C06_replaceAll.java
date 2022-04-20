package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {
        // kulanıcıdan isim soy isim bilgisini alıp
        //butun harfler * yapın
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isim ve soyisim girin");
        String isimsoyisim = scan.nextLine();

        System.out.println(isimsoyisim.replaceAll("\\S", "*"));//boslık dısındaki tüm karakterleri * yap


    }
}
