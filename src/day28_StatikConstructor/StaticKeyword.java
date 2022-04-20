package day28_StatikConstructor;

public class StaticKeyword {
    static int sayi1;
    int sayi2;

    public static void main(String[] args) {

        /*Static variableler direk classa baglidir
        class icerisinde yapilan her turlu degisiklik static variablelada kalici olur
        Instance variable lar ise obje ye baglidir
        instance variable'ra sadece obje uzerinden erisilebilir ve bir oje uzerinden yapilan degisiklikler
        instance variable'in degerini tum objeler icin kalici olarak degistirmez
        sadece o obje icin instance variable degerini kalici olarak degistirir

        */

        System.out.println("sayi1: " +sayi1);
       // System.out.println("sayi2: " + sayi2);//statik olmadigi icin main methiodtdan direk kullanamasin

        StaticKeyword obj1=new StaticKeyword();
        System.out.println(obj1.sayi2);
        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi1: " +sayi1);//1
        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//1

        StaticKeyword obj2=new StaticKeyword();

        System.out.println(obj2.sayi2);//0
        System.out.println(obj2.sayi1);//1

        obj2.sayi1++;
        obj2.sayi2++;
        System.out.println(obj2.sayi2);//1
        System.out.println(obj2.sayi1);//2

        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//2

        obj1.sayi1++;
        obj1.sayi2++;
        System.out.println(obj1.sayi2);//2
        System.out.println(obj1.sayi1);//3






    }
}
