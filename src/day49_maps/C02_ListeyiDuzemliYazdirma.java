package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzemliYazdirma {
    public static void main(String[] args) {
        Map<Integer,String> sinif=MapOlustur.myMap();
        System.out.println(sinif);
        sinifListYazdir(sinif);
    }

    private static void sinifListYazdir(Map<Integer, String> sinif) {
        System.out.println("Numara  Isim  SoyIsim  Brans ");
        System.out.println("**************************");


        Set<Integer> keySet=sinif.keySet();
        Collection<String> valueSet=sinif.values();
        System.out.println(keySet);
        System.out.println(valueSet.size());
        for (String each:valueSet) {
            System.out.println(each);

        }
    }

}
