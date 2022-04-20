package day25_List;

import java.util.ArrayList;
import java.util.List;

public class C08_listedeElemanlarinYeriniDegistirme {
    public static void main(String[] args) {
        //verilen bir listede istenen iki index'teki elementlerin yerini
        //kalici olarak degistiren bir method olusturun
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkindex=2;
        int ikinciindex=5;
        sayilar=swapelements(sayilar,ilkindex,ikinciindex);



    }

    public static List<Integer> swapelements(List<Integer> sayilar, int ilkindex, int ikinciindex) {

         // bir tem sayi olusturup
        // verilen indexlerdeki sayilari yer degistirin
        // indexleri kontrol edip sinirin otesinde index verildiyse uyari mesaji verin


    return sayilar;
    }
}
