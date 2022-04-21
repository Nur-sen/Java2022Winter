package NursenMap;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        //kitap listesini duzenli olarak yazdiralim

       Map<Integer,String> kitapListesiMap= MapOlustur1.map2Methot();
        System.out.println(kitapListesiMap);
        //key'lere tek tek ulasmak icin Set yapmamiz lazim

        Set<Integer> kitapKeySeti=kitapListesiMap.keySet();
        List<Integer> keySet=new ArrayList<>();//setteki elemenlari list'e ekledik
        keySet.addAll(kitapKeySeti);//key degerleri yazdirdik(String disindakileri yazdrma)
       // System.out.println(keySet);

        //key disindaki degerleri yani value'leri ulasacagimiz sekilde dizayn edelim
        //(Integer disindaki Stringleri yazdirma)

        Collection<String> kitapValueColl=kitapListesiMap.values();
        System.out.println(kitapValueColl);
        List<String > kitapValueList=new ArrayList<>();//coll dekileri liste attik
        kitapValueList.addAll(kitapValueColl);
        System.out.println(kitapValueList);

          /* her bir value birden fazla bilgiyi iceriyor
          onun icin value'leri multidimensional bir array'e atmak mantikli duruyor
          ancak MDA olusturmak icin boyutlari bilmeye ihtiyacimiz var
         */
        int outerArrayBoyut=kitapValueList.size();
        System.out.println(kitapValueList.size());//5

        //inner arraylerin index'ini bulmak biraz kopmleks olacak
        String ilkValue=kitapValueList.get(0);
        System.out.println(ilkValue);//Suc ve Ceza, Dostoyevski
        String ilkValueArray[]=ilkValue.split(",  ");//String'i array'e cevirdik
        int innerArrayBoyut=ilkValueArray.length;
        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];
        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[]=kitapValueList.get(i).split(",  ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                valueMDArr[i][j]=temp[j];
            }
            System.out.println("");

        } System.out.println("Numara  KitapAdi  YazarAdi ");
        System.out.println("============================ ");
        for (int i = 0; i <keySet.size() ; i++) {
            System.out.print(keySet.get(i));
            for (int j = 0; j <innerArrayBoyut ; j++) {
                System.out.print(valueMDArr[i][j]);
            }
            System.out.println("");
        }


    }

    }


