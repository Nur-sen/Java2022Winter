package day43_Errors_GarbageCollector;

public class C02_Final extends C01_Final{



    public static void main(String[] args) {
        System.out.println(C01_Final.okulIsmi);
        //C01_Final.okulIsmi="Hasan koleji";//erisim o
    }
   /* public static  void method1(){
        /*
        Override parent class'daki methodu child class'a uyarlamak demekti
        yani islevini degistirmek istiyoruz ancak
        parent clastaki method final olarak tanimlandigindan java methodun
        degistirilmesine4 izin vermiyor

        System.out.println("Parent class final method");
    }*/
}
