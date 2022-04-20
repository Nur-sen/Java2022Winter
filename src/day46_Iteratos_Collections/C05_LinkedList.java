package day46_Iteratos_Collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {
        //hem list hem de Queue'nun child classidir

        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);//add methodu listten geldigi icin hep sona ekler
        list.addFirst(11);//addFirst deque den gelir ve basa yazar
        list.addLast(12);//addLast deque den gelir sona yazar
    }
}
