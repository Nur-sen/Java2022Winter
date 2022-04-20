package day37_inheritance;

import day36_interitance.Parent;

public class Child extends Parent {
    //bir classin child clas yaptigimizda parent clasindaki
    //constructor'a ulasmasi gerekir
    //bu durumda parent clasdaki const. access modifer'i uygun bir modifer
    //yapilmalidir

    Child(){
        super();
        System.out.println("child class parametresiz cons ");
    }
    Child(int s){
        System.out.println("child class parametreli cons.");
        //Child class'da tum const. ilk satirina
        //javanin yerlestirdigi const. PARAMETRESIZ dir
        //yani super(); dir
    }
    Child(int sayi1,int sayi2){
        //eger parent classdan parametresiz const. degilde
        //baska bir const calistirmak istersek
        //onu Child classindaki const. ILK SATIRINA yazmaliyiz
        super(sayi1,sayi2);
        System.out.println("Child iki parametreli cons.");
    }

    public static void main(String[] args) {
        Child child = new Child(5,8);
    }


}
