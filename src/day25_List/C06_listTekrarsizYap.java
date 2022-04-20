package day25_List;

import java.util.ArrayList;
import java.util.List;

import static day25_List.C04_ListedenTekrarlielementleriSilme.tekrarsizListeOlustur;

public class C06_listTekrarsizYap {
    public static void main(String[] args) {
        //verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        //bir method olusturun
        //ornek :[1, 3, 5, 3, 5, 6, 1, 7] bu listi
        //output[1, 3, 5, 6, 7] bu hale dunusturun

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

          sayilar=tekrarsizListeOlustur(sayilar);


    }
    }
