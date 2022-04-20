package day19_doWilelop;

public class C01_Whileloop {

    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve
        // toplam kac tane olduklarini ekranda yazdirin

        int input=20;
        // forloop ilede yapilabilir
        //biz While loop ile yapalım
        int bölen=1;
        int sayac=0;

        while(bölen<=input){
            if(input%bölen==0){
                System.out.print(bölen + " ");
                sayac++;
            }
            bölen++;


        }System.out.println("");
        System.out.println(input +" sayını bölen " + sayac + " adet sayi vardır");


    }
}
