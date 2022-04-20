package day39_overriding;

public class OverridingChild extends OverridingParen{
    public  void method1(){
        System.out.println("Child class method1");

    }

    public static  void main(String[] args) {
        /*
        Bir obje olusturulurken data turu ve const ayni classtan secilmisse
         java  direk o classa gider hem variable hemde method icin o class da
         varsa kullanir yoksa o classin parentine bakar
         */

        OverridingChild obj1=new OverridingChild();
        obj1.method1();// Child class method1 bassinda birsey yoksa en yakindakini yazdirisuper.method1();
        obj1. method2();//Parent class method2


        OverridingParen obj2=new OverridingChild();
        obj2.method2();//Parent class method2
        obj2.method1();//Child class method1

        /*
        Eger data turu Parent const. child classtan secildiyse
        variablelarda yukardaki sekilde calismaya devam eder
        ancak methodlar icin data turunun oldugu class daki method
        child class tarafindan OVERRIDE edilmis diye kontrol etmemiz gerekir
        eger child classlarda bu method overrid
        edilmisse overrde eden method calisir
         */

        OverridingParen obj3=new OverridingParen();
        obj3.method2();//Parent class method2
        obj3.method1();//Parent class method1


    }
}
