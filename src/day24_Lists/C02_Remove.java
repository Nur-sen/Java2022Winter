package day24_Lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");

        // remove(istenen object) methodu istenen elementi kaldirip
        // bize true yada false doner
        //eger remove isleminin yapildigini kontrol etmek istiyorsaniz
        // methodu boolean bir varaible atayabiliriz
       boolean sonuc= isimler.remove("Oguzhan");//true
        //sonucu kullaniciya yazdirmak istersek
        // if else ile istediginiz degerlendirmeyi yazabiliriz

        System.out.println(isimler);//[Aykut, Yusuf, Ilker]
        if(sonuc==true){
            System.out.println("istediginiz isim silindi");
        }else{
            System.out.println("istediginiz isim listede olmadigindsan silinmedi");
        }


        //remove yazdigimizda sildim silmedim ihtimali kalmaz
        //bize removi edilen elementi doner
       // System.out.println(isimler.remove(1));
        isimler.remove(1);

        // yazdirsakta yazdirmasakta liste degisti ve 1. index 'deki element silindi
        System.out.println(isimler);//[Aykut, Ilker]



    }



    }

