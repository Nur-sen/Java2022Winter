package day25_List;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {

        // verilen bir array den istenen elementi silip kalanlari
        //yeni bir array olarak yazdiran bir method olusturun
        int arr[]={3,4,2,3,5,7,3,8,5,2,4};

        int istenmeyenElemen=5;
        istenmeyenelementiSil(arr,istenmeyenElemen);

    }

    public static void istenmeyenelementiSil(int[] arr, int istenmeyenElemen) {
        //1=istenmeyen elementi sayisini bulalim
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==istenmeyenElemen){
                sayac++;
            }

        }
        //2- yeni arrayi olusturalim
        int arrYeni[]=new int[arr.length-sayac];

        //3- eski array'den uygun elementleri yeniye tasi
        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=istenmeyenElemen){
                arrYeni[index]=arr[i];
                index++;
            }

        }
        //4- yeni array'i  yazdiralim
        System.out.println(Arrays.toString(arrYeni));

    }
}
