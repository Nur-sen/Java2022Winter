package day10_Switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {
        //concatenation yapmak icin iki ihtimalimiz var
        // istersek daha önce yaptıgımız + operatörünü kullanabiliriz
        // veya Strin class
        String str1="Java";
        String str2="candir";

        // java Candir yazdiralim
        System.out.println( str1+" "+ str2);
        String cumle=str1.concat(str2); // javaCandir
        cumle=str1.concat(" ").concat(str2);
        System.out.println("cumle");

        // concat icine String degilde sayi veya boolean deger yazsak?
        // concaat method un icine String parametre ister
        // String dısında bir data turu yazdıgımızda onu string haline getirmeliyiz

        // cumle=str1.concat(5);

        cumle=str1.concat(true+"");
    }
}
