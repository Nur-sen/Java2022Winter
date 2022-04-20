package day25_List;

import java.util.ArrayList;
import java.util.List;

public class C03_ListenElementlersilme {
    public static void main(String[] args) {
        // verilen bir array den istenen elementi silip kalanlari
        //yeni bir array olarak yazdiran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};

        int istenmeyenElemen=3;
        istenmeyenelementiSilveYazdir(arr,istenmeyenElemen);
    }

   public static void istenmeyenelementiSilveYazdir(int[] arr, int istenmeyenElemen) {

        List<Integer> yeniList=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
           if(arr[i]!=istenmeyenElemen){

           yeniList.add(arr[i]);
            }
       }
       System.out.println(yeniList);


    }
}
