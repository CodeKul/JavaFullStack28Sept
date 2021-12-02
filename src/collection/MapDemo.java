package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Pune");
        map.put(2,"Mumbai");
        map.put(1,"Pune");
//
//        map.forEach((k,v)->{
//            System.out.println("Key=>"+k+" value=>"+v);
//        });


        for(Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println("key=>"+m.getKey()+" value=>"+m.getValue());
        }

    }
}
