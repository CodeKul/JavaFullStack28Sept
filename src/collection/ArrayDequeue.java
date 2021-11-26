package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeue {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(30);
        deque.add(40);
        deque.offer(50);
//        System.out.println(deque.removeFirst());
//        System.out.println(deque.poll());
        deque.offerFirst(60);
//        System.out.println(deque.remove());
//        System.out.println(deque.removeLast());
//        System.out.println(deque.peek());
//        System.out.println(deque.peekFirst());
//        System.out.println(deque.peekLast());
//        System.out.println(deque.pop());
//        System.out.println(deque.removeFirstOccurrence(30));
//        System.out.println(deque.pollFirst());
//        System.out.println(deque.pollLast());
//        System.out.println(deque);


        Iterator<Integer> iterator = deque.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
