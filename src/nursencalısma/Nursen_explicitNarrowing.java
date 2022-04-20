package nursencalısma;

public class Nursen_explicitNarrowing {
    public static void main(String[] args) {

        int sayi1=879;
        double sayi2=10;
        double sayi3=sayi1/sayi2;
        System.out.println(sayi3);
        int sayi4=(int) (sayi1/sayi2);
        System.out.println(sayi4);
        int sayi5;
       // byte sayi6=sayi5;

        sayi5=130;
        byte sayi6=(byte) sayi5;
        System.out.println(sayi6);

        sayi5=140;
        sayi6=(byte) sayi5;
        System.out.println(sayi6);

        sayi5=260;
        sayi6=(byte) sayi5;
        System.out.println(sayi6);




    }
}
