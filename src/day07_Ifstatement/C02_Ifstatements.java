package day07_Ifstatement;

public class C02_Ifstatements {
    public static void main(String[] args) {


        int a=10;
        int b=20;

        if (a>b && b<100){
            System.out.println("isteginiz gerçeklesecek");
            System.out.println("bady icindeki tüm kodlar calisir");

        }
        if (a<0) System.out.println("süslü parantez olmazsa sadece satir calisir");


        // if cümlesinin daha anlaşılır olmasını istiyorsanız if badisini süslü
        // parantes icinde yazmalısınız bady i süslü parantes içine yazmasakta
        // calışır fakat gördügü ilk noktalı vürgüle kadar calışır

       // 24. satırdaki kod 15. satırdaki if doğru olsada calışır false olsada calışır

        System.out.println("2. satir da calisti");



    }
}
