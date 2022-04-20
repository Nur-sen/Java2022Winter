package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr[][]={{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]);//7
        System.out.println(arr[1][1]);//10


        //ilk innerin array'in tum elementlerini yazdırın

        System.out.println(arr[0]);//[I@5b464ce8 arr[] bir array oldugu icin direk yazdırılmaz

        System.out.println(Arrays.toString(arr[0]));//[3, 1, 7]

        System.out.println(Arrays.toString(arr));//[[I@5b464ce8, [I@57829d67]

        //MDArrays tüm elemetleri bir array olarak yazdırmk istersek

        System.out.println(Arrays.deepToString(arr));//[[3, 1, 7], [6, 10, 2]]



    }
}
