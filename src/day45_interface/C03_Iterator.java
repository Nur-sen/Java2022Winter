package day45_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C03_Iterator {
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);//[5, 7, 8, 6, 9]

        // for each kullanarak her elemani 2 artiralim
        for (Integer each:liste) {
            each+=2;
        }
        System.out.println(liste);





    }
}
