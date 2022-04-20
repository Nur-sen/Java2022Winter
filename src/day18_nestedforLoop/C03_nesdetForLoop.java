package day18_nestedforLoop;

public class C03_nesdetForLoop {
    public static void main(String[] args) {
        //Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //        *
        //        * *
        //        * * *
        //        * * * *
        int input=5;




        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {

                //nested for loop ya diktörgen veya ücgen formatinda olabilir
                //diktörtgen istedigimizde iki loop icinde bagimsiz en point belirleriz
                //ücgen sekli vermek icin inner loopun end pointini olarak outer degiskene baglarız
                System.out.print("* ");

            }
            System.out.println("");

        }


    }
}
