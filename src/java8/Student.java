package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {

        Student student1 = new Student(1,"Rahul",34);
        Student student2 = new Student(2,"Mahesh",34);
        Student student3 = new Student(3,"Aakash",74);
        Student student4 = new Student(4,"Ravi",84);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        List<Integer> list = students.stream()
                .filter(f->f.marks == 34)
                .map(m-> m.marks + 1)
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
