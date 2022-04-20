package day24_Lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);//[Aykut,Yusuf,ilker,Oguzhan]

        isimler.set(1,"seckin");//yusuf gitti yerine seckin geldi
        System.out.println(isimler);

        //daha onceden listeden var olanlarinarsiv gibi tutmak istersek
        List<String> logListesi=new ArrayList<>();

        logListesi.add(isimler.set(2,"Cosmos"));//[Aykut, seckin, cosmos, Oguzhan]

        System.out.println(isimler);
        System.out.println(logListesi);//[Ilker]
    }

}
