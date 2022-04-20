package day15_methodcreation;

public class C06_methodcreation {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        //iki varaible' in değerlerini toplayan br method olusturalım
        //1. adım: methot adını yazalım
        //2.adım: methoda göndermem gereken arguman var mı?


        ikiSayiTopla(25,50);

        C04.dortHarfiTersineCevir("sema");




    }
    // bir metodu olusturmak çalışmas için yeterli değildir
    //methot ancak cağrılırsa calışır
    // aynı class veya farklı classda olmasının hiç önemi yoktur main methota
    //yukarıdan aşağıya doğru çalışır ve geldiği satırı calıştırır



    private static void ikiSayiTopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami : " + (a+b));
    }
}
