package day22_Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {


        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi=1;


        istenenElemenVarMi(arr,istenenSayi);
        //eger Javadan hazir BinarySearch ile yapmak isterseniz
        //önce sort metodunu kullanıp  sonra BinarySearch yapmalıyız



    }

    private static void istenenElemenVarMi(int[] arr, int istenenSayi) {

        boolean sonuc=false;


        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==istenenSayi){
                sonuc=true;
                break;
            }

        }
        System.out.println(sonuc);

    }
}
