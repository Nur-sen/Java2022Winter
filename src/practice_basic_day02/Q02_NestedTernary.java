package practice_basic_day02;

import java.util.Scanner;

public class Q02_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {

        char finalnotu= 'A';// deger degişebilir

        String sonuc=(finalnotu=='A')? "Gayet Basarili": (finalnotu=='B')? "Basarili":
        (finalnotu=='C')? "Ha gayret" : " digerleri";
        System.out.println(sonuc);




    }
}
