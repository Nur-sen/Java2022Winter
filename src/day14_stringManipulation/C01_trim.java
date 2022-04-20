package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {

       String str="  Siz ne derseniz deyin, Java bildigini okur.  ";
       str.trim();
        System.out.println(str);//boslukları silmez   Siz ne derseniz deyin, Java bildigini okur.
        System.out.println(str.length());//47

        str=str.trim();
        System.out.println(str);//Siz ne derseniz deyin, Java bildigini okur.
        System.out.println(str.length());//43





    }
}
