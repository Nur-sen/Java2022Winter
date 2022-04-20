package day23_multiDimensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {
        // boyutları belirli bir array i elementleri girmeden olusturalim
        //bir okulda icinde 24 öğrenci 8 sınıf vardır

        int arr[][]=new int[8][24];

        // bir ilçede her birinden 24 öğrencilik 8 sınıf bulunan 5 okul vardır

        int ilce[][][]=new int[5][8][24];

        // bir okulda 3 tane 24 kişilik 2 tane de 22 kişilik sınıf vardır
        // farklı uzunluktaki arrayleri otomatik bir arrayde yapamayız ayrı ayrı yapabiliriz

        int sınıf24[][]=new int[3][24];
        int sınıf22[][]=new int[2][22];

        // olustururken elemenetleri atama  yaparsak farklı uzunluktaki inner array ler tanimlarız


        int arr1[][]={{3,1,7},{6,10,2}};

    }
}
