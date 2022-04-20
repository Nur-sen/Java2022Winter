package NursenCalisma2;

public class Nursen_Stringsayitoplama {
    public static void main(String[] args) {

//Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
// String str1 = “$13.99”3e
// String str2 = “$10.55”
// ipucu : Double.parseDouble() methodunu kullanabilirsiniz

        String str1="$13.99";
        String str2="$10.55";

        double sayi1=Double.parseDouble(str1.substring(1));//dolar işaretinden kurtulmak için
        double sayi2=Double.parseDouble(str2.substring(1));
        System.out.println("Toplam : "+ "$"+ (sayi1+sayi2));


        //valof ile cözüm

        String str3="$13.99";
        String str4="$10.55";

        str3=str3.replaceAll("\\D","");// dolar işaretinden kurtulmak için
        str4=str4.replaceAll("\\D","");

        double sayi3=Double.valueOf(str3);
        double sayi4=Double.valueOf(str4);

        double sonuc=(sayi3+sayi4)/100;
        System.out.println("Toplam : " +"$" + sonuc);








    }
}
