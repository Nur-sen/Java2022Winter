package day39_overriding;public class Corolla extends Toyota {



    protected String hiz="Corolla arabalar max 200 km hiz yapar";
    protected String yakit="Arabalar farkli yakit kullanirlar";
    protected String model="Corolla";




    public  void motor(){
        System.out.println("corolla araclar cevreci motor kullanirlar" );
    }

    public void yakitTuketimi () {
        System.out.println("corolla 5.6 lt yakit tuketirler");
    }

    public void vitesSayisi(){
        System.out.println("corolla 5 viteslidir");


    }

    public static void main(String[] args) {

        /*data turu ve const farkli oldugundan const calistigi icin obje
        //constr.in oldugu class ozelliklerini tasir ancak data  turu parent secildigi varaible'lar
        data turunun secildigi class ve onun parent classlarindan deger alabilir
        methodlar cinde yine data turunun oldugu classa gideriz ancak method calistirilmadan
        once method override edilmis mi diye kontrol edilir


         */
        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket);//araba classindan alir
        System.out.println(arb1.hiz);//corolla clasindan alir
        System.out.println(arb1.yakit);//coralla
        System.out.println(arb1.marka);//toyota
        System.out.println(arb1.sirketMerkezi);//toyota
        System.out.println(arb1.model);//corolla


        Toyota arb2=new Corolla();
        System.out.println(arb2.hareket);//araba classindan alir
        System.out.println(arb2.hiz);//Toyota clasindan alir
        System.out.println(arb2.yakit);//araba
        System.out.println(arb2.marka);//toyota
        System.out.println(arb2.sirketMerkezi);//toyota
      //  System.out.println(arb2.model);//CTE veriri kendi ve ust clasinda olmadigi icin
        arb2.motor();//corolla
        arb2.garanti();//toyota
        arb2.yakitTuketimi();//corolla
        //arb2.vitesSayisi();data turu olan toyotadan baslayinca
        // boyle bir methot bulamadik CTE veriri


        Araba arb3=new Corolla();
        System.out.println(arb3.hareket);//araba classindan alir
        System.out.println(arb3.hiz);//Araba clasindan alir
        System.out.println(arb3.yakit);//Araba
        System.out.println(arb3.marka);//Araba
       // System.out.println(arb3.sirketMerkezi);//CTE kendi ve ust clasinda olmadigi icin
      //  System.out.println(arb3.model);//CTE kendi ve ust clasinda olmadigi icin
        arb3.yakitTuketimi();//corolla
        arb3.motor();//corolla
        //arb3.garanti();//aramaya araba classina bakti bulamayinca CTE
        //arb3.vitesSayisi();CTE







    }
}
