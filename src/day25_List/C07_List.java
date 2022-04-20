package day25_List;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {
        // bir listede ortalaminin ustunde olan element sayisini bulunuz

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);

        //ortalamalari bul
        Double ortalam=0.0;
        Double toplam=0.0;

        for (int i = 0; i <sayilar.size() ; i++) {
            toplam+=sayilar.get(i);

        }
        ortalam=toplam/sayilar.size();
        System.out.println(ortalam);//3.875

        // ortalamnin ustunde olanlari bir liste at

        List<Double> ortalamninUstundekiler=new ArrayList<>();
        for (int i = 0; i <sayilar.size() ; i++) {
            if(sayilar.get(i)>ortalam){
                ortalamninUstundekiler.add(sayilar.get(i));
            }

        }
        System.out.println(ortalamninUstundekiler);//[5.0, 5.0, 6.0, 7.0]


    }
}
