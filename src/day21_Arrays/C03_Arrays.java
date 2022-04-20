package day21_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        int arr[];//deger ataması yapmadık java kabul etti ancak kullanmamıza izin vermez


        arr=new int[6];
        System.out.println(Arrays.toString(arr));//[0,0,0,0,0,0]
        System.out.println(arr.length);//6
                                       // String deki gibi length() parantez yok

        //arrydeki her bir elemanı index degeri kafar artıralım

        for (int i = 0; i <arr.length;  i++) {
            arr[i] +=i;

        }
        System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4, 5]

        //son index deki elementi yazalım

        System.out.println(arr[arr.length - 1]);//5






    }
}
