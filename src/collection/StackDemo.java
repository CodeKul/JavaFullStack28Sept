package collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        stack.push(10);//0
        stack.push(20);//1
        stack.push(30);//2
        stack.push(40);//3
        stack.add(50);//3

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.search(Integer.valueOf(10)));
        System.out.println(stack.firstElement());
        System.out.println(stack.lastElement());
        System.out.println(stack.lastIndexOf(40));
        System.out.println(stack);

    }
}
