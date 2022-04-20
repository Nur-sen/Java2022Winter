package day47_Collection_LinkedList;

import java.util.HashSet;
import java.util.Set;

public class C04_ArraydenTekrarlarSilme {
    /*
    verilen bir array'den tekrar eden elemanlari silip
    uniqeu elementtlerden olusan bir array halina donduren bir method olusturun
     */
    public static void main(String[] args) {
        int arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arr=benzersizYap(arr);
    }

    private static int[] benzersizYap(int[] arr) {
        Set<Integer> benzersizSet=new HashSet<Integer>();
        for (Integer each:arr
             ) {
            benzersizSet.add(each);
        }
        System.out.println(benzersizSet);

        //sette index yapi olmadigindan for loop kulanilamaz
        int index=0;
        for (Integer each:benzersizSet
             ) {
            arr[index]=each;
            index++;

        }
        return arr;
    }
}
