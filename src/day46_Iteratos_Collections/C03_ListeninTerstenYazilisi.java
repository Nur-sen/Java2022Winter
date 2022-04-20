package day46_Iteratos_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_ListeninTerstenYazilisi {

    //verilen listeyi iterator ile sondan basa yazdir
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste);//[5, 7, 8, 6, 9]

        //once iterator'u olusturup sona yazalim
        ListIterator itr= liste.listIterator();
        while(itr.hasNext()){
            itr.next();
        }
        //en sondan basa gelelim
        while(itr.hasPrevious()){
            System.out.print(itr.previous() + " ");//9 6 8 7 5

        }


    }
}
