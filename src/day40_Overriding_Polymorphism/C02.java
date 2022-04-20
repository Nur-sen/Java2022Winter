package day40_Overriding_Polymorphism;

public class C02 extends C01{

    private void method4(){
        System.out.println("Parent method4");
        //Parent class daki private method4'e
        //Cild classdan ulasmamiz mumkun olmadigindan
        //java bu iki methodu tamamen farkli iki method olarak kabul eder
    }
    @Override
    protected String method3(){

        //Covariant icin yazildi
        return "Java";

    }


    @Override
    public void method2() {
        /*
        @Override notasyonu overridden methodu ile overriding methodu birbirine baglar
        farkinda olunmadan overriden silinirse veya signature degistirilirse
        bu iliski bozulacagi icin java CTE verir

        notosyan kullanilmazsa java bunlari iliskisini bilir ama
        overridenden method silinirse
        sesini cikarmaz

         */
        System.out.println("Child methot2");//Child methot2
    }

    public static void main(String[] args) {

        C02 obj=new C02();

        obj.method1();// parent Methot 1
        obj.method2();//Child methot2

        C01 obj2=new C02();
        obj2.method1();// parent Methot1 once data turune bakar yani C01 de var mi diye
                       // varsa bu sefer bakacak overriding edilmis mi diye
                       // eger edilmemisse data turu olani yazdirir eger ov. edilmisse ovr. edileni yazdirir

        obj2.method2();//Child methot2

        C01 obj3=new C01();

        obj3.method1();//parent Methot 1
        obj3.method2();//parent Methot 2
    }
}
