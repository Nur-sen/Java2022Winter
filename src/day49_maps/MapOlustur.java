package day49_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer,String> myMap(){
        Map< Integer,String> sinifList=new HashMap<>();
        sinifList.put(101," Esat, Alkan, Dev, 1453");
        sinifList.put(102," Veli, yan,   QA,  1990");
        sinifList.put(103," Ali,  Van,   C#,  2000");
        sinifList.put(104," Ayse, Can,   C#,  2001");
        sinifList.put(105," Ahmet, Han,  C#,  2002");



        return sinifList;
    }


}
