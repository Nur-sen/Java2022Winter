package day36_interitance;

public class SurekliIsci extends Isci{


    public static void main(String[] args) {
        SurekliIsci surIsc1 = new SurekliIsci();
        surIsc1.persNo=500;
        surIsc1.isim="Cem";
        surIsc1.soyIsim="Akay";
        surIsc1.statu="Isci";
        surIsc1.saatUcreti=11;
        surIsc1.maas=surIsc1.maasHesapla();
        System.out.println(surIsc1);



    }
    @Override
    public String toString() {
        return "SurekliIsci{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
