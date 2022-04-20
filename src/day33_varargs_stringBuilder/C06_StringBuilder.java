package day33_varargs_stringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Prize dikkat");

        System.out.println(sb1.insert(12," edin."));
        String  str="Hayat cok guzel seyler var";
        System.out.println(sb1.insert(0,str,0,6));//Hayat Prize dikkat edin.

        System.out.println(sb1.reverse());//.nide takkid ezirP tayaH

        System.out.println(sb1.reverse());//Hayat Prize dikkat edin.

        System.out.println( sb1.substring(3,5) );//at
        System.out.println(sb1);//Hayat Prize dikkat edin.




    }
}
