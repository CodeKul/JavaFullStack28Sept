package collection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
    public static void main(String[] args) throws Exception {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(50);

        System.out.println(getCapacity((ArrayList<?>) list));

//
//        System.out.println(list.get(1));
//        System.out.println(list.isEmpty());
//        System.out.println(list.size());
//        System.out.println(list.remove(1));
//        System.out.println(list.contains(40));
//        System.out.println(list.indexOf(40));
//        System.out.println(list.set(3,50));
        System.out.println(list);

//        list.forEach(s->{
//            System.out.println(s);
//        });
//
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//
//        List<Integer> list1 = Arrays.asList(12,2342,24,54,5,34534,5);
//
//        List<Integer> list2 = new ArrayList<>(List.of(12,132,3,23,23,23,21));
//
//        List<Integer> list3 = new ArrayList<>(){{
//           add(12);
//           add(23);
//           add(34);
//        }};
//
//        List<Integer> list4 = new ArrayList<>(Arrays.asList(12,2342,24,54,5,34534,5));
//

    }
}
