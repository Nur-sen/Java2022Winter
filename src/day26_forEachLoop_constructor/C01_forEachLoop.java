package day26_forEachLoop_constructor;

public class C01_forEachLoop {
    public static void main(String[] args) {

        int arr[]={2,4,6,8,11};

        //elementleri forloop ile yazdir

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println("");

        //bunu for each loop ile yapacak olursak
        // for each loopu yazdirmak icin hedef bir collection vermeliyiz
        for (int each: arr){
            System.out.print(each + " ");
        }
        //avantaji index baslangic ve bitis degeri gibi detaylarla ugrasmaya gereak kalmadan
        //collections dan butun degerleri bize getirir
        //dezavantaji : indexe bagli bir islem yapamayiz

    }
}
