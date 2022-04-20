package day22_Arrays;

import java.util.Arrays;

public class C02_sort {
    public static void main(String[] args) {
        //verilen bir array de en kücük ve en büyük değerleri yazdırın

        int arr[]={3,5,6,1,9,45,25,4,9,0};

        //sort metodu olmadan yapalım

        int enKücükSayi=Integer.MIN_VALUE;         //arr[0];
        int enBüyüksayi=Integer.MAX_VALUE;          //arr[0];

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]<enKücükSayi){

                enKücükSayi=arr[i];
            }
            if (arr[i]>enBüyüksayi){
                enBüyüksayi=arr[i];
            }

        }

        System.out.println(("Array'deki en kücük sayi : " + enKücükSayi));
        System.out.println(("Array'deki en büyük sayi : " + enBüyüksayi));

        Arrays.sort(arr);
        System.out.println(("Array'deki en kücük sayi : " +arr[0]));
        System.out.println("Array'deki en buyuk sayi : " + arr[arr.length-1]);


    }
}
