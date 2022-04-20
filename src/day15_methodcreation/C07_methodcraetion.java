package day15_methodcreation;

public class C07_methodcraetion {
    public static void main(String[] args) {

        //String'i calıstıran method olusturalım
        // hosgeldiniz diyen bir mehod olusturn
        // kapanma mesaji yazan bir method olusturun

        hosgeldinYazdır();

    }
    private static void kapanmaMethodu() {

        System.out.println("Bizi tercih ettiğiniz icin tesekkür ederiz");
    }

    public static void hosgeldinYazdır() {
        System.out.println("hosgeldin");
        stringYazdir("böyle de olur");

    }

    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
