package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

        Employee obj1 = new Employee(1,"Rakesh","Pune");
        Employee obj2 = new Employee(3,"Umesh","Pune");
        Employee obj3 = new Employee(2,"Rahul","Pune");

        List<Employee> list  =  new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list,Collections.reverseOrder());

        list.forEach(s->{
            System.out.println(s);
        });
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Employee employee) {
//        if(this.id==employee.id){
//            return 0;
//        }else if(this.id> employee.id){
//            return 188;
//        }else {
//            return -1;
//        }
//    }

    @Override
    public int compareTo(Employee employee) {
        return this.name.compareTo(employee.name);
    }
}
