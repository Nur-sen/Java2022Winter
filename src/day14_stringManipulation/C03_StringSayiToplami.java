package day14_stringManipulation;

public class C03_StringSayiToplami {
    public static void main(String[] args) {

//Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
// String str1 = “$13.99”3e
// String str2 = “$10.55”
// ipucu : Double.parseDouble() methodunu kullanabilirsiniz

        String str1 = "$13.99";
        String str2 = "$10.55";
       double num1=Double.parseDouble(str1.substring(1));//$kurtulmak icin substring(1)yazıldı
       double num2=Double.parseDouble(str2.substring(1));
       System.out.println("toplam :"+ "$"+ (num1+num2));

       // yada valueof ile cözelim
        str1=str1.replaceAll("\\D","");//1399 cevirdi ama string olarak
        str2=str2.replaceAll("\\D","");//1055 cevirdi ama string olarak

        double str1sayi=Double.valueOf(str1);
        double str2sayi=Double.valueOf(str2);
        double sonuc=(str1sayi+str2sayi)/100;//sayilardan virgül atıgımız için 100'e böldük
        System.out.println("verilen String sayilarin Toplamı : $ " + sonuc);


    }
}
