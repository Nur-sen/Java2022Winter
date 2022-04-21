package day49_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer,String> myMap(){
        Map< Integer,String> sinifList=new HashMap<>();
        sinifList.put(101," Esat, Alkan, Dev, 2012");
        sinifList.put(102," Veli, yan,   QA,  2000");
        sinifList.put(103," Ali,  Van,   C#,  1999");
        sinifList.put(104," Ayse, Can,   C#,  1999");
        sinifList.put(105," Ahmet, Han,  C#,  1999");



        return sinifList;
    }


}
