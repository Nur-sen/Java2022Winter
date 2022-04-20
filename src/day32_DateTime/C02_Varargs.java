package day32_DateTime;

public class C02_Varargs {
    public static void main(String[] args) {
        //parametre olarak bir int
        //ve istedigimiz kadar string alan
        //en uzun kelimenin harf sayisi ile int parametre degerini
        // carpip sonucu yazdiran bir methiod olusturun
        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";
        String str3="Ali";

        carpim(sayi,str1,str2,str3);
        // bir methoda varargs disinda parametre kullanacaksak
        // once diger parametreleri yazip varargs en sona yazmaliyiz
        // bu sebeble bir methodda birden fazla varargs olmamaz


    }

    private static void carpim(int sayi, String... str) {
        String enUzunStr="";
        for (String each: str
        ) {
            if(each.length()>enUzunStr.length()){
                enUzunStr=each;
            }

        }
        System.out.println("istenen deger : " + sayi* enUzunStr.length());
    }

}
