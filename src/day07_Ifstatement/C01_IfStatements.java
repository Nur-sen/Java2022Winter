package day07_Ifstatement;

public class C01_IfStatements {
        public static void main(String[] args) {



        int a = 2;
        int b = 3;

        if (a!=b) {
            System.out.println("verilen sayilar esit");

        }

        if (a<100){
            System.out.println("a yüzden büyük");

        }

        if (a*b>1){
            System.out.println("sayilarin capimi 5 ten büyüktür");
        }






        // bagımsız if cümleleri kendileri dışındaki kodlarla ilgilenmezler
        // bir sart ve o sarta baglı sonuca odaklıdır
        //birden fazla bagımsız if cümlesi oldugundan hepsinin bodysi calışabilecegi gibi
        //hicbirinin body si calısmayabilir.


    }
}