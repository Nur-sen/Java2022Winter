package day12_stringManipulation;

public class C02_lastindexof {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin
        // cumledeki
        //kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
        //- Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis

        String cümle="Java ogren,yeni program ile yeni bir sayfa ac";
        String kelime="yeni";
        int ilkKullanim=cümle.indexOf(kelime);// ya -1 cıkar yada indeks cıkar
        int sonKullanim=cümle.indexOf(kelime);

        if(ilkKullanim==-1){
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        }else if(ilkKullanim==sonKullanim){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        }else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");
        }
        String str="Eclipse";
        System.out.println(str.lastIndexOf("p",4));
    }

}
