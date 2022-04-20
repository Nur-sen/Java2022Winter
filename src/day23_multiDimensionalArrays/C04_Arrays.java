package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static <Scaner> void main(String[] args) {

        //kullanıcıya kaç elementlik bir array olusturacagını sorun,
        // arrayi olusturup elemenetleri kullanıcıdan alip array e atayin


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kaç elementli bir array istediğinizi yazın : ");

        int uzunluk=scan.nextInt();// 5 yazdıysa

        int arr[]=new int[uzunluk];//[0, 0, 0, 0, 0]

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array icin " + (i+1) + ". bir eleman giriniz : ");
            arr[i]=scan.nextInt();


        }
        System.out.println(Arrays.toString(arr));





    }
}
