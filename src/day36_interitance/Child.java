package day36_interitance;

public class Child extends Parent{

    Child(){
       super();
        System.out.println("Child cons calisti");
    }
    //tum classlarda biz gormesekte
    // javanin olusturdugu defoult constructor vardir

    //Extends keyword kullanilan class'lardaki
    // tum constructor ilk satirinda biz gormesek bile
    // super() constructor call vardir
    //yani parent classin paremetresiz cons call
    public static void main(String[] args) {
        Child child = new Child();
    }
}
