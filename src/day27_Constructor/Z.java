package day27_Constructor;

public class Z{
    String isim;
    String soyisim;
    int numara;
    boolean gercekMi;

    public Z(String ism, String soyism, int no, boolean grc) {
        isim=ism;
        soyisim=soyism;
        numara=no;
        gercekMi=grc;
    }




    public String toString() {
        return("Isim " + isim+ "' soyisim : " + "Numara : " + numara);

    }
}
