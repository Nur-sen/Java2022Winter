package day17_forloop;

public class C04_forLoop {
    public static void main(String[] args) {

        //10 ile 30 arasındaki(1 ve 30 dahil)
       // sayilari arasında virgül olacak seklinde yazdır

        //sabit kod ile yazılan kod

        for (int i = 10; i <=29; i++) {
            System.out.print(i+",");

        }
        System.out.println(30);

        //dinamik method ile yazilan kod

        int baslangıc=15;
        int bitis=20;
        for (int i = baslangıc; i <=bitis ; i++) {
            if(i<bitis){
                System.out.print(i+ ",");
            }else{
                System.out.println(i);

            }

        }
        for(int i=1; i<=5; i++) {

            for(int j=(5-i); j>1; j--) {

                System.out.print(i+j);

            }

            System.out.println();

        }

    }
}
