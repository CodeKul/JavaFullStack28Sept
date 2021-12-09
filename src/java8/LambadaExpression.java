package java8;

//Lambada exp => is anonymous function
//use =>  it takes less code
//        it used to give implementation to functional interface

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@FunctionalInterface
interface MyInterface1 {
    String msg();
}

@FunctionalInterface
interface MyInterface2 {
    int add(int a, int b);
}

public class LambadaExpression {

    public static void main(String[] args) {

        MyInterface1 myInterface1 = () -> {
            return "Hello";
        };
//        System.out.println(myInterface1.msg());

        MyInterface2 myInterface2 = (a, b) -> {
            return a + b;
        };

//        System.out.println(myInterface2.add(3,7));

        List<Integer> list = Arrays.asList(12, 1, 3, 4, 34242, 43);
        AtomicInteger sum = new AtomicInteger(0);

//        for (int i = 0; i < list.size(); i++) {
//            sum = sum + list.get(i);
//        }

        list.forEach(s->{
            sum.set(sum.get() + s);
        });
        System.out.println(sum);


//        Consumer<Integer>consumer=(Integer i)-> {
//                System.out.println(i);
//        };

//        list.forEach(consumer);
    }
}