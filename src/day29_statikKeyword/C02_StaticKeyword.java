package day29_statikKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {
        ///baska clastaki statik class uyelerine ulasmak icin
        //sadece clasIsmi.staticUyeIsmi
        // yazmamiz yeterlidir

        System.out.println(C01_Static.okulTelefonu);

        C01_Static.okulTelefonu="1234656890";

        System.out.println(C01_Static.okulTelefonu);

        //baska classdaki static olmayan uyelerine
        //ancak o classtan obje olusturarak ulasabiliriz
        //ve obje ile yapilan atamalar sadece o obje icin gecerli olur

        C01_Static obje1=new C01_Static();
        C01_Static obje2=new C01_Static();

        System.out.println(obje2.okulIsmi);//yildiz Koleji
        obje2.okulIsmi="Sabir Koleji"; //degisiklik sadece obj2 yi etkiler

        System.out.println(obje2.okulIsmi);//Sabir Koleji

        System.out.println(obje1.okulIsmi);//yildiz Koleji

    }
}
