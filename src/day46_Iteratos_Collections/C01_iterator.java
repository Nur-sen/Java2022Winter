package day46_Iteratos_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_iterator {
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);//[5, 7, 8, 6, 9]

   Iterator itr= liste.iterator();//iterator methodunu olusturdugumuz liste objesi
                                  // uzerinden arryList classindan calistiriyoruz


        /*
        iterator nasil calisir
        bir iterator obj olusturmak icin collection uyesi bir obje
        kullanmaliyiz
        terator itr= liste.iterator();
        yani biz bu iterator objesini bizim ornegimizde liste
        objesi uzerinde calismak icin olusturmus olduk
        biz iterator objesini olusturdugumuzda iterator collection ilk
        elementinin oncesine gidip
        bekler
        [(itr) 5, 7, 8, 6, 9]
        itr.hasNext();===> true iterator'a yaninda eleman varmi diye sorar
                           true yada false doner
        itr.Next(); ===>iterator bir sonraki elemantin yanina gecer
                        ve uzerinden gectigi elementi bize dondurur
           [ 5,(itr) 7, 8, 6, 9]   //5
           [ 5, 7,(itr) 8, 6, 9]   //7
           itr.remove();//iterator'in yanindaki elemani sildi
           dolayisi ile ust uste iki kere itr.remove(); KULLANILAMAZ

           once itr.next(); methodunu calistirip
           interator in


         */
        System.out.println(itr.hasNext());//true
        System.out.println(itr.next());//5
        System.out.println(itr.next());//7
        itr.remove();//5 7

        System.out.println(liste);//[5, 8, 6, 9]



    }
}
