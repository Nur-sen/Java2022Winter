package NursenCalisma2;

public class MDArrays {
    public static void main(String[] args) {
        //Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana
        //yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }

        int array[][]={ {1,2,3}, {4,5,6} };
        int carpim=1;

        for (int i = 0; i <array.length;  i++) {
            for (int j = 0; j <array[i].length ; j++) {
                carpim*=array[i][j];


            }

        }
        System.out.println("tum elemanlarin carpimi : " + carpim);




    }
}
