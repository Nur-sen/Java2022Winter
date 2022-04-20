package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_arrays {

    public static void main(String[] args) {
        //verilen bir array e yeni bir element ekleyen bir method olusturun

        int arr[]={3,5,7};

       // arr[3]=8; arraya olmayan bir elemenet ekleme yapamayız

       // arr={1,3,5,}; var olan bir array'e aynı boyutta da olsa yeni bir atama yapamayız

        arr=new int[4];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]

        int arrYeni[] =new int[5];
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0]
        arrYeni[0]=2;
        arrYeni[3]=5;

        arr=arrYeni;
        System.out.println(Arrays.toString(arr));//[2, 0, 0, 5, 0]

        // bir array e icinde hazır elementlerin oldu yeni bir array atamak isterseniz bunu
        // {1,2,3} şeklind edeğil
        // new int[3] diye olusturark tamamladığımız bir array i
        //assing(atama) ederek yapabiliriiz

       int arrEnYeni[]={1,2,3,4,5};
       arr=arrEnYeni;
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]





    }
}
