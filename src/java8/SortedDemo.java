package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 42, 43, 47, 5, 86, 7, 89, 9);

        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

    }
}
