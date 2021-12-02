package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    int id;
    String name;
    String address;

    public ComparatorDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

        ComparatorDemo obj1 = new ComparatorDemo(1, "Rakesh", "Pune");
        ComparatorDemo obj2 = new ComparatorDemo(1, "Rmesh", "Pune");
        ComparatorDemo obj3 = new ComparatorDemo(2, "Rahul", "Pune");

        List<ComparatorDemo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Comparator<ComparatorDemo> comparator = ( comparatorDemo, t1) ->{
                if (comparatorDemo.id == t1.id) {
                    return 0;
                } else if (comparatorDemo.id > t1.id) {
                    return 1;
                } else {
                    return -1;
                }
        };

        Comparator<ComparatorDemo> comparator1 = ( comparatorDemo,  t1) ->{
                return comparatorDemo.name.compareTo(t1.name);
        };

        Collections.sort(list, comparator.thenComparing(comparator1));


        list.forEach(s -> {
            System.out.println(s);
        });
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

