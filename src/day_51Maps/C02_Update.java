package day_51Maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C02_Update {
    public static void main(String[] args) {

        // verilen Map deki 102 olan ogrencinin bransini degistirin Java yapalim
        /*
        Map'de volue kompleks olabildigi icin
        volue icerisinden bir bolumu degistirmek istersek
        once volue'ye ulasmak
        sonra onu manipule ederek  istedigimiz degisikligi
         */

        Map<Integer,String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap);

       Set<Map.Entry<Integer,String>> sinifEntrySet= sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each : sinifEntrySet) {
            Integer keyEntry= each.getKey();


            String valueEntry= each.getValue();
            String valueArr[]=valueEntry.split(", ");
            valueArr[2]="Java";
            String valueYeni=valueArr[0] + ", "  + valueArr[1] + ", " + valueArr[2] +", "
                    + valueArr[3];
            sinifListMap.put(keyEntry,valueYeni);

        }
        System.out.println(sinifListMap);

    }
}
