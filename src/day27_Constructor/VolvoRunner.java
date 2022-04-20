package day27_Constructor;

public class VolvoRunner {
    public static void main(String[] args) {
        Volvo arb1=new Volvo();
        System.out.println(arb1.marka);//volvo
        arb1.yakit="Dizel";
        arb1.elektirkliMi=false;
        System.out.println(arb1.maxHiz);//240

        System.out.println(arb1.toString());//model : null Yakit : Dizel Yil :0 Max hiz : 240


        Volvo arb2=new Volvo();

        arb2.yakit="Elektirikli";
        arb2.elektirkliMi=true;
        arb2.model="XC90";
        System.out.println(arb2.toString());//model : XC90 Yakit : Elektirikli Yil :0 Max hiz : 240


    }
}
