package NursenCalisma2;

public class Whileloop3 {
    public static void main(String[] args) {
        // kullanıcıdan bir sayi alın ve
        //bu sayinin rakamlari toplamını yazdırın

        int input=1236;
        int rakam=0;
        int rakamlarToplamı=0;

        while(input>0){
            rakam=input%10;
            rakamlarToplamı+=rakam;
            input/=10;

        }
        System.out.println(rakamlarToplamı);


    }

}
