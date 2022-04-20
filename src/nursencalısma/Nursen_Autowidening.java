package nursencalısma;

public class Nursen_Autowidening {
    public static void main(String[] args) {
        //Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
        //birer degisken olusturup adim adim widening yapin ve yazdirin
        byte sayi1=20;
        short sayi2=sayi1;
        int sayi3= sayi2;
        long sayi4=sayi3;
        float sayi5=sayi4;
        double sayi6=sayi5;
        System.out.println(sayi6);
        //Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin

          sayi3=485;
          int sayi7=10;
          sayi3= sayi3/sayi7;
         System.out.println(sayi3);
        sayi3= sayi3/sayi7;
        System.out.println(sayi3);
        sayi3= sayi3/sayi7;
        System.out.println(sayi3);



        //Soru 3 ) Float data turunde bir variable olusturun ve yazdirin
        float numara1=2.124545f;
        System.out.println(numara1);

        //Soru 4 ) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip
        //yazdirin

        double num1=255.36;
        int num2=(int) num1;
        System.out.println(num2);

        byte num3= (byte) num1;
        System.out.println(num3);

        //Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin

        int num4=25;
        int num5=5;
        int num6= num4/num5;
        System.out.println(num6);

        //Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin

        int num7=82;
        double num8=24.4;
        int num9= (int)( num7/num8);

        //Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim
        int num10=65;
        byte num11=25;
        byte num12=(byte) (num10/num11);








        }





    }

