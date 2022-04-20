package day11_stringManipolation;

import java.util.Scanner;

public class C05_indexof {
    public static void main(String[] args) {
        String str1="Java bir baska güzel valla cok guzel";
        System.out.println(str1.indexOf('J'));//0
        System.out.println(str1.indexOf("l"));//19
        //istersek bir başka harf yada metin olarak verdiğimizde String in indexini döndürür


        System.out.println(str1.length()-1);//19
        System.out.println(str1.indexOf("aska"));//10

        // aynı harften birden fazla varsa
        System.out.println(str1.indexOf("b"));//buldugu ilk eslesmenin indexsini döndürür

        System.out.println(str1.indexOf('b', 5));
        // bu methodda java aramaya fromindex olarak yazdığımız index den başlar
        //(inclusive)


        // verilen Stringteki 2. a harfini bulalım

        int ilkindex=str1.indexOf('a');//1
        System.out.println(str1.indexOf('a',ilkindex+1));//3

        int ilkbindex=str1.indexOf("b");//5 9
        System.out.println(str1.indexOf("b",ilkindex+1));

        // 20. indexten sonra guzel aratma

        System.out.println(str1.indexOf("guzel",20));//31

        //Stringde olmayan harf aratma
        System.out.println(str1.indexOf("y"));//y yok demesi lazım ama return
        //type i index yok demesi sayısal karsılıgı olarak javayı -1 döndürmeyi tercih etmiştir

        // kullanıcıdan mail adresi isteyi @ isareti icermiyorsa gecersiz
        // iceriyorsa mailiniz kabul edildi yazın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen mailinizi girin");
        String mail=scan.next();

        if(mail.indexOf("@")==(-1)){
            System.out.println("Gecersiz");

        }else{
            System.out.println("gecerli");
        }
        // indexOf methodu icerisine yazılan <string veya charın metinde hangi indekxte
        //oldugunu dondurur eger aradıgımız metin yada char yoksa olmadığının delili olarak -1
        // döndürür

    }
}
