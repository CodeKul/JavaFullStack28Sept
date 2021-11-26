package collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    int id;
    String name;
    String  address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    public static void main(String[] args) {

        Student obj1 = new Student(1,"rahul","pune");
        Student obj2 = new Student(1,"rahul","pune");
        Student obj3 = new Student(1,"rahul","pune");

        System.out.println(obj1.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj3.hashCode());

        Set<Student> set = new HashSet<>();
        set.add(obj1);
        set.add(obj2);
        set.add(obj3);

        set.forEach(s->{
            System.out.println(s.id+" "+s.name+"  "+s.address);
        });
    }
}
