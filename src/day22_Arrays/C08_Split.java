package day22_Arrays;

public class C08_Split {
    public static void main(String[] args) {
        //verilen bir cümlede istenen harfin kac defa kullanıldığını yazdıran
        //bir method olusturun

        String cümle="Nerede o 'hello world' yazdıramayan ogrenciler";
        String harf="e";

        harfKacKereKullanilmis(cümle,harf);


    }

    private static void harfKacKereKullanilmis(String cümle, String harf) {

        int sayac=0;

        String karakterler[]=cümle.split("");
        for (int i = 0; i < karakterler.length; i++) {
            if(karakterler[i].equals(harf)){
                sayac++;
            }


        }
        System.out.println("Aradiginiz " + harf + "verilen cumle " + sayac + " adet kullanilmis");

    }
}
