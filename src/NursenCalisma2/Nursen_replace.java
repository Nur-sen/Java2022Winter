package NursenCalisma2;

public class Nursen_replace {
    public static void main(String[] args) {

        String str="bugun ne cok sey ogrendik";

        //cümledek bosluk dısındaki karakterleri bulunz



        System.out.println(" space haric karakter sayısı : " +
                str.replace(" ","").length());
        // atama yapılmadıgı surece kalıcı değişiklik yapılmaz sadece yazdır

        System.out.println("orjinal str karakter sayısı : " +str.length());


        //str da kalıcı değisiklik yapalım
        //bugün yerine yarın
        //ogrendik yerine ogrenecegiz

        str=str.replace("bugun","yarın");
        str=str.replace("ogrendik","ogrenecegiz");
        System.out.println("kalıcı degişiklikten sonra : " + str);

        str.replace("ne cok","ne az");//atama yoksa değişiklik yapmaz
        System.out.println(str);



    }
}
