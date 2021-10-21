package controlflowstatement;

import java.util.ArrayList;
import java.util.List;

public class ForLoopDemo {

    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        //traditional for loop
//        for(int i=0;i<arr.length;i=i+2){
//            System.out.println(arr[i]);
//        }

        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
//
//        for(int i = 3;i< arr.length;i--){
//            System.out.println(arr[i]);
//        }

//        //enhanced for loop
//        for (int i:arr) {
//            System.out.println(i);
//        }



//        for(int i=1;i<=10;i++){
//            System.out.println(i);
//        }

        List<Integer> list = new ArrayList<>();
        list.add(122);
        list.add(122);
        list.add(12342);
        list.add(1343);

        list.forEach(s->{
            System.out.println();
        });

    }
}


/**
 *  * * * *
 *  * * * *
 *  * * * *
 *  * * * *

 */