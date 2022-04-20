package day10_Switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {
        // String de her hangibir karakteri almak istediğimizde o harfin indeksini
        // kullanarak str.charAt.(istenenIndex) yazabiliriz
        //indeks charAt() 0 dan başlar

        String str="java Cok Güzel";
        // J yi yazdıralım
        System.out.println(str.charAt(0));
        // G yi yazalım
        System.out.println(str.charAt(9));
        // va yazdıralım
        System.out.println(""+ str.charAt(2)+str.charAt(3));
        //cOK  seklinde yazdırın
        System.out.println(""+str.toLowerCase().charAt(5)+str.toUpperCase().charAt(6)+
                str.toUpperCase().charAt(7));
        // son karakteri yazdır
        // Stringde 14 harf var son harfin indexi14-1
        System.out.println(str.charAt(14-1));


        // eger uzulugu index olarak girersek
        // girersek java hata verir
        System.out.println(str.charAt(14));

    }
}
