package day09_ternary_Switch;

public class C03_ternary {
    public static void main(String[] args) {

        int sayi =1234;
        // kullanıcıdan istemek yerine int sayı nın değeri değiştirlebilir

        // verilen sayının 3 ve daha çok basamaklı olup olmadığını kontrol eden ve sonucu
        // yazdıran bir ternary olusturun

      String sonuc = sayi>=100?"sayi 3 basamaklı veya daha büyük" : "sayi negatif veya 3 basamaktan kücük";

      //ternary bize sonuc döndürdügü için
        // ya bu sonucu direk yazdırmalıyız
        // yada sonucun data turune uygun bir variable atama yapabiliriz
        System.out.println("girdiginiz sayı analizi " + sonuc);

    }
}
