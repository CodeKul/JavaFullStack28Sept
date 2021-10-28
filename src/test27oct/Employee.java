package test27oct;

import java.util.ArrayList;

public class Employee {
    int id;
    String name;
    String address;
    double salary;

    public Employee(int id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee obj1 = new Employee(1, "rakesh", "nagpur", 4444.00);
        Employee obj2 = new Employee(2, "rahul", "pune", 4444.00);
        Employee obj3 = new Employee(3, "akash", "Mumbai", 44434434.00);


        ArrayList<Employee> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).id+" "+list.get(i).name);
//        }

        list.forEach(s->{
            System.out.println(s.id+" "+s.name);
        });
    }
}
