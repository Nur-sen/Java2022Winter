package day05_matematikselislemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        //primitive data turu ile non primitive arasındaki farklar

        String str="Java";
        int sayi=10;
        System.out.println(str.toUpperCase());//JAVA
        System.out.println(str);


        //non-primitive data türleri data depolamak yaninda bir cok faydalı metdota sahiptir
        // ancak primitive data ntürlerinin böyle bir özelligi yoktur
        // primitive data türleri sadece degerleri saklar container



        // primitive data turleri icin de bazi method lar gerekli oldugunda
        // java ara bir cözüm üretmistir
        // Java her bir pirimitive data türünü non - primitive olarak kullanmak icin
        // ozel Classlar uretmistir ve buna Wrapper Class adini vermistir


        double sayi2=20.5;
        // sayı2 primitive oldugundan sayi2. dedigimde hicbir methot gelmez

        Double sayi3;
        // sayi3 wrapper Class olan double class ını kullandıgından
        //sayi3. dedigimizde bircok methot gelir

    }
}
