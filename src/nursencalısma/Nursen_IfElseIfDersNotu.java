package nursencalısma;

import java.util.Scanner;

public class Nursen_IfElseIfDersNotu {
    public static void main(String[] args) {
       //Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
        //50’den kucukse “D”,
        // =50-60 arasi “C”,
        // =60-80 arasi “B”,
        // =80’nin uzerinde ise “A”

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen notunuzu girin");
        double not= scan.nextDouble();
        if (not<50 || not>100){
            System.out.println("lütfen gecerli bir not girin");
        }
        else if(not<50){
            System.out.println("notunuz D");
        }
        else if(50>=not && not<=60){
            System.out.println("notunuz C");
        }
        else if(60>=not && not<=80){
            System.out.println("notunuz B");
        }
        else{
            System.out.println("notunuz A");

        }


    }
}
