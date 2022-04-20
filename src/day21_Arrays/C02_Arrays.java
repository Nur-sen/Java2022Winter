package day21_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String arr1[]={"ali","veli","Ayse"};
        //array icindeki elemetlere ulasabilmek icin index kullanırız

        System.out.println(arr1[0]);//Ali

        arr1[1]="Esila";
        System.out.println(arr1[1]);//Esila
        //arrayin ic,ndeki indexi kullanarak elementere ulasılabilir ve update edebiliriz

        int arr2[]=new int[4];

        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
       // System.out.println(arr2[5]);//.ArrayIndexOutOfBoundsException

        //Arrayin tamamını yazdırmak istersek

        System.out.println(arr2);//[I@5b464ce8
                                 // arrayler non-prmitive oldukları icin direk yazdırmak istersek
                                 // java referans bilgisini yazar


        for (int i = 0; i < 4; i++) {
            System.out.print(arr2[i]+" ");

        }
        System.out.println("");

        //array i yazdırmak icin java daki Arrays classındaki toString() kullanılır
        System.out.println(Arrays.toString(arr2));//[0, 0, 0, 0]

        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2));//[0, 11, 0, 22]
        System.out.println(Arrays.toString(arr1));//[ali, Esila, Ayse]



    }
}
