package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi1=879;
        double sayi2=10;

        double sayi3=sayi1/sayi2;// 87.9
        System.out.println(sayi3);

        int sayi4=(int)(sayi1/sayi2);

                                //int sayi4= sayi1/sayi2;//87.9
                               // deger dooble varaible int
                               // yani varaible daha dar dolayısı ile java bunu otomotik yapmaz sorumlulugu almamazı ister
                               // sag tarafta yazdıgımız (int) sorumluluk bende demek

        System.out.println(sayi4);

        int sayi5=140;
        byte sayi6=(byte) sayi5;  // sag taraftaki deger int >sol taraftaki varaible byte

        System.out.println(sayi6);
        sayi5=130;
        sayi6=(byte) sayi5;

        System.out.println(sayi6);

        sayi5=268;
        sayi6=(byte) sayi5;
        System.out.println(sayi6);

        sayi5=520;
        sayi6=(byte) sayi5;
        System.out.println(sayi6);

        sayi5=-130;
        sayi6=(byte) sayi5;
        System.out.println(sayi6);

        sayi5=44;
        sayi6=(byte) sayi5;
        System.out.println(sayi6);


    }
}
