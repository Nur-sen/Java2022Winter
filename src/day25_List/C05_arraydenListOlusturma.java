package day25_List;

import java.util.Arrays;
import java.util.List;

public class C05_arraydenListOlusturma {
    public static void main(String[] args) {
        // verilen arayi listeye cevirin

        String arr[]={"A", "B" , "C"};
        List<String> arraydenList= Arrays.asList(arr);
        // arrayden liste cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz
        // dolayisila yeni list ile add() ' remove()' clear() gibi methodlari calistirmak
        // istedigimizde Exception olusur

        //arraydenList.add("J");//UnsupportedOperationException


        System.out.println("19.satirda list : " + arraydenList);

        arr[1]="F";

        System.out.println("23.satirda Array : " + Arrays.toString(arr));
        System.out.println("24.satirda list : " + arraydenList);

        arraydenList.set(0,"Y");

        System.out.println("27.satirda Array : " + Arrays.toString(arr));
        System.out.println("28.satirda list : " + arraydenList);







    }
}
