package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericAnyType {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(50);

        iterate(list);

        List<String> list1 = new ArrayList<>();
        list1.add("Ten");
        list1.add("Twenty");
        list1.add("Thirty");

        iterate(list1);

    }

    public static void iterate(List<?> list){
        list.forEach(s->{
            System.out.println(s);
        });
    }
}
