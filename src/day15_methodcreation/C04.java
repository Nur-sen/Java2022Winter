package day15_methodcreation;

public class C04 {
    // main class olmadan da bir class olusturulur
    //ancak bu class direk calışmaz
    //sadec depo görevi görür
    //baska claaslardan kullanılabilecek

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(3) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 4");
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }

    public static void ucHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(2) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 3");
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }
}

