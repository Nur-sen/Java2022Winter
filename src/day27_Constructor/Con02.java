package day27_Constructor;

public class Con02 {
    public static void main(String[] args) {
        Cons01 obj1=new Cons01();// default devrede
    /* Cons01  classinda Hic contructor olusturmasak
    java default constructori kullandigindan
    obj1'i uretebildik
    ancak biz parametereli yada parametresiz bir constructor yazdigimizda
    java default constructur i siler
    dolayisi ile biz herhangibir constructor olusturdugumuzda
    daha obce baska classlar veya kullanicilarin olusturmus
    olabilecegi objeleri kullanabilmeleri icin
    default constructor in islevini gercektirecek
    parametresiz bir constructor olusturmakta fayda var


    */
        Cons01 obj2=new Cons01("Java");



    }
}
