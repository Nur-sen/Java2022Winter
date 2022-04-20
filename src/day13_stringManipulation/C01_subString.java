package day13_stringManipulation;

public class C01_subString {
    public static void main(String[] args) {
        String str="Java ile IT cok guzel";
        System.out.println(str.substring(5));//ile IT cok guzel
        //yukardaki Stringi Mehmet Hoca ile IT cok guzel yazılabilir
        System.out.println(str.replace("Java","Mehmet Hoca"));
        System.out.println("mehmet Hoca" + str.substring(5));

        System.out.println(str.substring(9));// yazılan index inclusive

        //eger bir indeksten sona kadar olan bir parcayı değil de
        // belirli bir parcayı almak istersek
        // 2 parcayı parametre yazmak gerekiyor
        // str.subString(baslangıcIndeksi,bitisİndexi)
        //baslangıc indexi  incluis yani dahildir
        // biitiş indexi    eclusive yani hariç dahil değildir
        System.out.println(str.substring(0,5));//Java
        System.out.println(str.substring(0,1));
        // 5. harfi String olarak bulalım
        String harf=str.substring(5,6);
        System.out.println(str.substring(5,6));

        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7));//hiçlik döndürür

        //System.out.println(str.substring(5,2));// hata verir

        System.out.println(str.substring(str.length()-1));//son harfi verir
        System.out.println(str.substring(str.length()-5));
        System.out.println(str.substring(str.length()));//son harften sonraki yani hiçlik verir









    }
}
