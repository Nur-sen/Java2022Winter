package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
     /*
     Javada collection uyesi bir yapida
     data turu Object secilirse her data turunden deger ekleyebiliriz
     ancak bu durumda surekli casting problemleri ile karsilasabiliriz
      */
        List<Object> list=new ArrayList<>();
        list.add("ergin");
        list.add(15);
        list.add(100.2);
        System.out.println(list);
        list.set(1,(Integer)(list.get((1)))+10);

        Map< Integer,String> sinifList=new HashMap<>();
        //bir sinifda ogrenci no ve isim soyisim brans olarak olusturmak istiyoruz
        //siralama onemli
        //key tek bir unique degerdir
        // ama volue/deger birden fazla bilginin birilesiminden olusabilir
        //bu durumda daha sonra istedigimiz bilgiler dogru sekilde ulasabilmak icin
        //tum elementler icin volue ayni bicimde olusturulmalidir
        sinifList.put(101,"Esat, Alkan, Dev");
        sinifList.put(102,"Veli, yan, QA");
        sinifList.put(103,"Ali, Van, C#");
        System.out.println(sinifList.keySet());//[101, 102, 103]
        System.out.println(sinifList.values());//[Esat, Alkan, Dev, Veli, yan, QA, Ali, Van, C#]


    }
}
