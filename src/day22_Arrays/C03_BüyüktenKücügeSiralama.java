package day22_Arrays;

import java.util.Arrays;

public class C03_BüyüktenKücügeSiralama {

    public static void main(String[] args) {

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        terstenSiralaYazdir(arr);

        // en büyük sayiyi yazdır
    }

    public static void terstenSiralaYazdir(int[] arr) {
        Arrays.sort(arr);


        int tersArr[]=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            tersArr[i]  =arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(tersArr));

    }
}
