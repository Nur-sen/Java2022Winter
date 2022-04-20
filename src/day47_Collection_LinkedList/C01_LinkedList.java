package day47_Collection_LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {/*
    LinkedListin iki tane parent interface'i vardir
    LinkedList olustururken data turu olarak;
    LinkedList secersek iki paren'deki tum methodlar kullanilir
    List secersek sadece list interface'indeki methodlar
    DEque/Queue secersek deque deki methodlari kullaniriz


    */

        LinkedList<Integer> ll1=new LinkedList<>();
        ll1.add(10);//linkedList



        //sadece list interface'inden ozellikler kullanmak istersek

        List<Integer> ll2=new LinkedList<>();
        ll2.add(10);//linkedList
        ll2.remove(0);


        //sadece deque den gelen ozellikleri kullanmak istersek

        Deque<Integer> ll3=new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);
        System.out.println(ll3);//[15, 20]

        ll3.addLast(40);//[15, 20, 40]






    }
}
