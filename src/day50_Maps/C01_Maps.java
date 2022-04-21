package day50_Maps;

import day49_maps.MapOlustur;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C01_Maps {
    public static void main(String[] args) {
        //sinifdaki ogrenci listesini duzenli sekilde yazalim

       Map<Integer,String> siniflist= MapOlustur.myMap();
        System.out.println(siniflist);

        /*eger keylere tek tek ulasmak istersek
        index yapisina ihtiyacimiz var
        ancak  map index yapisini desketlemez
        bunun icin key'leri once bir set'e
        sonra da set'in tum elemanlarini bir liste ekledik

        */
        Set<Integer> sinifKeySeti= siniflist.keySet();
       List<Integer> keyList=new ArrayList<>();

        keyList.addAll(sinifKeySeti);
        System.out.println(keyList.get(1));

        List<String> valueList=new ArrayList<>();
        valueList.addAll(siniflist.values());
        System.out.println(valueList.get(1));
      






    }
}
