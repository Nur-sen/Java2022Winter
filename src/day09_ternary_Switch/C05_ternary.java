package day09_ternary_Switch;

public class C05_ternary {
    public static void main(String[] args) {

        // bazen ternary deki iki sonucun data türleri farklı olabilir


        // verilen sayı 100 den büyükse sayı nın karesini alip yazdiran
        // 100 den kücükse "sayi 10 den bğuyuk olmali" yazdıran
        // bir ternary olusturalım

        int sayı=150;
        // ternary bize sonuc getirdiğinden ya sonucu direk yazmalıyız yada
        // bir degişkene atamalıyız
        // eger sonuclar farklı data türündeyse
        // atama yapacagımız variable ın data turu tek olacagından
        // atama yapamayız
        // SADECE direk yazdırabiliriz
        System.out.println(sayı > 100 ? sayı * sayı : "sayı 100 den buyuk olmali");

    }
}
