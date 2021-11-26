package collection;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(40);

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(40);
        set1.add(230);
        set1.add(30);
        set1.add(400);


        Set<Integer> set2 = new TreeSet<>();
        set2.add(40);
        set2.add(230);
        set2.add(30);
        set2.add(400);

        System.out.println(set2);
    }
}
