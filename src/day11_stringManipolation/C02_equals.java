package day11_stringManipolation;

public class C02_equals {
    public static void main(String[] args) {
        String str1="ali Can";
        String str2="Ali" + "Can";
        System.out.println("str1: "+str1);
        System.out.println("str2 : " + str2);
        System.out.println("== ile karsılastır "+ (str1==str2));
        System.out.println("equals ile karsılastır "+ str1.equals(str2) );


        String str3=str1+"";
        System.out.println("str3 : " + str3);
        System.out.println("== ile karsılastır "+ (str3==str2));
        System.out.println("equals ile karsılastır "+ str3.equals(str2) );
       //String de == her zaman dogru sonuc vermez
       //bunun icin emin olmak icin equals methodunu kullanmayi tercih ederiz

       String str5="hasan";
       String str6="HASAN";
        System.out.println(str5.equals(str6));// false
        System.out.println(str5.toUpperCase().equals(str6));// true,



    }
}
