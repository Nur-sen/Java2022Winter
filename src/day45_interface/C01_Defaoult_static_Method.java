package day45_interface;

public class C01_Defaoult_static_Method implements I01_Default_static{
    /*
    bir interface defaoult veya static olarak tanimlanan ve body'si olan
    method'larin override edilmesi mecburu DEGILDIR
     */
    @Override
    public void method1() {
        System.out.println("child class method");


    }
    /*
    Parent  Interface'deki default olarak tanimlanan method'u
    istersek
     */

    public static void main(String[] args) {
        //Interface'de static olarak tanimlanan methodlarla
        //static yontemlerle ulasilabilr InterFaceIsmi.methodIsmi

        I01_Default_static.method3();

        C01_Defaoult_static_Method obj=new C01_Defaoult_static_Method();
        obj.method1();//child class method1
        obj.method2();//parent interface'den gelir
       // obj.method3(); eski classlarda static bir uyeye static olmayan yollarlada
        //ulasabilrdik
        //ancak interface icerisinde static olarak tanimlanan methoda
        //static olmayan yontemlerle ulasilamaz

    }
}
