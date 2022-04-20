package day22_Arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {


        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi=3;


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.binarySearch(arr,istenenSayi));//2 bize istediğimiz elementin indexini doner

        //eger olmayan bir elementi aratirsak
        //Java bulamadığını göstermek icin * isareti koyar sonrada 0 sayi olsaydı
        // sıralaması ne olacak ise o sırayi bize verir



    }
}
