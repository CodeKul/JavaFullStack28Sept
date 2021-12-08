package collection;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(101,"Pune");
        treeMap.put(112,"Pune");
        treeMap.put(123,"Pune");
        treeMap.put(108,"Pune");

//        System.out.println(treeMap.entrySet());
//        System.out.println(treeMap.ceilingKey(110));
//        System.out.println(treeMap.floorKey(110));
//        System.out.println(treeMap.firstEntry());
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.subMap(107,113));
        System.out.println(treeMap.higherEntry(101));
        System.out.println(treeMap);
    }
}
