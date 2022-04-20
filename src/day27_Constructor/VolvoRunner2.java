package day27_Constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {

        //her obje olusturdugumuzda model yakit gibi degerleri
        // tek tek atama yapmak
        //istemiyorsak

        Volvo arb1 =new Volvo("XC60",false,2023,"benzin");
        System.out.println(arb1);//model : XC60 Yakit : benzin Yil : 2023 Max hiz : 240

    }
}
