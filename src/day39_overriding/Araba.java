package day39_overriding;


public class Araba {
    protected String hareket="Arabalar teker ile hareket eder";
    protected   String hiz="Arabalar motor gucune gore hiz yapar";
    protected String yakit="Arabalar farkli yakit kullanirlar";
    protected String marka="Araba uretildikleri markaya sahiptir";


    public  void motor(){
        System.out.println("arabalar farkli markalarda motor kullanirlar" );
    }

    public void yakitTuketimi () {
        System.out.println("Arabalar motor gucu ve yakit turune gore tuketim yaparlar");
    }
}
