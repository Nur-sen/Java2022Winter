package day13_stringManipulation;

public class C02_subString {
    public static void main(String[] args) {
        //1-49 of results for "nutella"
        //bu arama sonucundaki bulunana sonuc sayısı 100 den kücük ise super
        // az ise "az sonuc bulundu" yazdırın

        String str="1-49 of 7000 results for \"nutella\"";


        int ilkSpace=str.indexOf(" ");//4
        int ikinciSpace=str.indexOf(" ",ilkSpace+1);
        int ucuncuSpace=str.indexOf(" ",ikinciSpace+1);
        String aramaSonucuSayısıStr=str.substring(ikinciSpace+1,ucuncuSpace);

        int aramaSonucuSayısıInt=Integer.valueOf(aramaSonucuSayısıStr);

        if(aramaSonucuSayısıInt>100){
            System.out.println("super");
        }else {
            System.out.println("az sonuc bulundu");

        }


    }
}
