package day45_interface;

public interface I01_Default_static {
    /*
    Interface'lerde sadece abstract method bulunur
    body'si olan concrete bir method olusturmak istedigimizde java CTe verir

    ancak java8 ve uzeri versiyonlarda,istisnai olarak
    static veya defaoult olarak tanimlanan methodlarin body'si olabilir
    ancak burada kullanilan defaoult keywordu access modifier degildir
    cunku Interface'lerde tum method'lar public ve abstract'ti

    asagidaki ornekte gorulecegi gibi defaoult olarak tanimlanmis bir method'a
    access modifier olarak public yazabilirisiniz
    (access modifier yazmasak da Java method'u public olarak kabul edecektir)

     */
    void method1();

    public default void method2(){
        System.out.println("Interface'deki defaoult method");

    }
    static void method3(){
        System.out.println("Interface'deki static method");

    }
}
