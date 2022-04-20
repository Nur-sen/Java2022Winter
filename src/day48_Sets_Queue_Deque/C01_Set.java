package day48_Sets_Queue_Deque;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    /*
    verilen array'in tekrar eden elementlerini sadece
    bir kere yazdirin
    Set ile yazdir
    not: set siralama yapmaz index yapisi yoktur
     */
    public static void main(String[] args) {
        int arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arrayiTekrarsizYazdirin(arr);
    }

    private static void arrayiTekrarsizYazdirin(int[] arr) {
        Set <Integer> tekrarsizElemanKumesi=new HashSet<>();
        for (Integer each:arr) {

            tekrarsizElemanKumesi.add(each);

        }
        System.out.println(tekrarsizElemanKumesi);//[1, 2, 3, 4, 5, 6, 7, 8]

    }


}
