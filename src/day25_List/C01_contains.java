package day25_List;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {
    public static void main(String[] args) {
        List<String> harfler= new ArrayList<>();
        harfler.add("D");
        harfler.add("M");
        harfler.add(1,"T");//[D, T, M]
        harfler.add(0,"T");

        System.out.println(harfler);
        System.out.println(harfler.contains("T"));//true

        List<String> karakterler= new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");
        System.out.println(harfler.containsAll(karakterler));//true

        karakterler.add("N");
        System.out.println(harfler.containsAll(karakterler));//false


    }
}
