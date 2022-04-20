package day47_Collection_LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        //Listen gelen ozellikleri biliyoruz
        // o yuzden Deque den gelen ozellileri kullaniyoruz

        Deque<Integer> ll1=new LinkedList<>();
        ll1.addFirst(10);//basa eleman ekler add( mt gore daha hizli
        ll1.addLast(20);// sona eleman ekler add() gore daha hizli
        System.out.println(ll1);//[10, 20]
        System.out.println(ll1.element());//ilk elementi silmeden bize dondurur
        System.out.println(ll1);
        System.out.println(ll1.getLast());//20 son elementi getirir
        System.out.println(ll1.getFirst());//10 ilk elemani getiri

        ll1.offer(30);//kuyrugun sonuna ekler ama bize birsey dondurmez
        System.out.println(ll1);//[10, 20, 30]
        ll1.offerLast(40);//sona ekler ture dondurur
        System.out.println(ll1);//[10, 20, 30, 40]
        ll1.offerFirst(50);//basa ekler
        System.out.println(ll1);//[50, 10, 20, 30, 40]


    }
}
