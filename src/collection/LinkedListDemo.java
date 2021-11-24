package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

//        LinkedList stores duplicate values
//        LinkedList maintain insertion order
//        it uses doubly LinkedList to store element

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.get(1));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.remove(1));
        System.out.println(list.contains(40));
        System.out.println(list.indexOf(40));
        System.out.println(list.set(3,50));
        System.out.println(list);
    }
}
