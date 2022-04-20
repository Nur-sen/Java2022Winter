package day43_Errors_GarbageCollector;

public abstract class C04 {
    /*
    bir asstract class da abstract veya concrete methodlari bulunabilir
    Child class'larin abstract method'lari override etmesi MECBURIDIR
    concrete method'larin override edilmesi OPSIYONELDIR
     */

    public  abstract void absMethod();//abstract methodlar static yapilmaz


    public void concreteMethod(){

        System.out.println("C04 concrete method");
    }

    public static void concreteStaticMethod(){

        System.out.println("C04 concrete static method");
    }
    public static void main(String[] args) {
        /*
        Abstract classlarda const. sahiptir
        Abstract Class'lardan obje OLUSTURULAMAZ

        Abstract class'lar OBJE BARINDIRMAYAN
        sadece child class'lar icin
        UYULMASI SART OLAN veya OPSIYONEL
        birakilan ozellikleri tanimladigimiz bir depo class gibidir

         */
       // C04 obj= new C04();
        System.out.println("bu class abstract");// yazdirir ama obje olusturulamaz

        concreteStaticMethod();
    }
}
