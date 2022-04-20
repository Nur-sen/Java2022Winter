package day26_forEachLoop_constructor;

public class Araba {


    /* javada her class olusturdugumuzda
    java o class dan ilerde objeler uretmek gerekecegini bilir
    ve biz ozellikle belirtmesekte java
     her olusturdugu class'a constructor koyar


     java'nin clas olusturuken classa koydugu constructor' a
     DEFAULT CONSTRUCTOR denir ve constructor gorunmez


     eger biz gorunur bir constructor'imiz olsun istersek
     default constructor ile ayni gorevi yapan bir constructor da olusturabiliriz
     veya istersek ayni kaliptan farkli desenlerden objeler olusturmak
     icin farkli ozelliklerden constructorlarda olusturabiliriz


     constructorlari birbirinden farklilastiran tek ayricalik kullanilan
     paramertre sayisi ve parametre data turudur

     */


    public Araba(){

        System.out.println("parametresiz constructor calisti");
        /*bir kod blogunun method yada constructor olup olmnadigindan emin olmak icin
        iki seye dikkat etmek gerekiyor
        1- constructorlarin ismi class ismi ile ayni olmak zorundadir yani buyuk harfle baslar
        2-Constructorlarin return type'i olmaz

        ozetle constructorlarin adi class adiyla ayni olmali ve return type olmamali

         */


    }
    public Araba(String renk){
        System.out.println(renk + " renkli araa uretildi");
    }
    public  Araba(int yil) {
        System.out.println(yil+ " model uretildi ");
    }
    public  Araba(int yil,String renk){
        System.out.println(yil + " model " + renk + " renginde araba uretildi");
    }


}
