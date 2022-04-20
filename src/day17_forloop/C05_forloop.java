package day17_forloop;

public class C05_forloop {
    public static void main(String[] args) {
        //k. 100 den kücük bir tam sayi isteyin
        //1 den balayarak girilen sayiya kadar 3'ün kati olan
        // sayilari yzdırın


        int sayi=57;

        for (int i = 1; i <=sayi ; i++) {
            if(i%3==0){
                System.out.print(i+ " ");
            }

        }
    }
}
