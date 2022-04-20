package day47_Collection_LinkedList;

import java.util.LinkedList;

public class C03_LinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> ll1=new LinkedList<>();
        System.out.println(ll1.peek());//bos kullaninca nul dondurur
        //System.out.println(ll1.element());//bosken kullanildiginda exception verir
        System.out.println(ll1.poll());//
        System.out.println(ll1.pollFirst());//
        ll1.pop();//ilk elementi silip bize dondurur ilk elementi bulamazsa exception
                 // verir
        ll1.push(30);//listenin basina ekler
        ll1.push(20);//
        System.out.println(ll1);

        System.out.println(ll1.remove());//
        ll1.push(40);
        ll1.push(50);
        ll1.remove(50);
        ll1.push(30);
        System.out.println(ll1);
        ll1.removeFirstOccurrence(30);
        System.out.println(ll1);

    }
}
