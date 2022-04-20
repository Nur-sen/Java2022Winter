package day15_methodcreation;

public class C09_methotcreation {
    public static void main(String[] args) {

        String isim="Esat";
        String soyisim="ALKAN";
        String kKNo="1234567891234567";



        // egerbir method dan bir işlem yapmasını
        //  ve yaptığı işlemi bize getirmesini isteri
        //return type değil bize getirecegi sonucun data turunde olmlıdır
       String gizlenmisIsimSoyisim= isimSoyisimGizle(isim,soyisim);
        // bana isim ve soyisim gizlenmiş halini getirmesini istiyorum
        //beklediğim donus string olur
        System.out.println(gizlenmisIsimSoyisim);
        String gizlenmisKKNo=krediKartiGizle(kKNo);

        krediKartiGizle(kKNo);
        System.out.println(gizlenmisKKNo);




    }

    public static String krediKartiGizle(String kKNo) {
        String yeniKKNo="**** **** **** " + kKNo.substring(12);
        return yeniKKNo;

    }

    public static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).replaceAll("\\S", "*");

        String yeniSoyisim = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\S", "*");
// method olusturmaa 3. adım method caısınca sadece bir sey mi yazdıracak yoksa bize
        // data mı döndürecek karar vermekti
        //bu soruda gizlenmiş isim ve soyisim döndürmesi istendiğinden
        //return type i void değil string sectik
        //ve methot
        return yeniIsim+ " "+yeniSoyisim;

    }
}
