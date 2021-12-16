package java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) throws Exception {
        Employee obj = new Employee(1, "Rakesh", null);
//        System.out.println(obj.getEmail());
//        System.out.println(obj.getEmail().toLowerCase());

        if (obj.getEmail() != null) {
            System.out.println(obj.getEmail().toLowerCase());
        } else {
            System.out.println("Email is null");
        }

        Optional<Employee> optional = Optional.empty();//empty optional

//        Employee obj1 = new Employee(1, "Rakesh", null);
//        Optional<String> optional1 = Optional.of(obj1.getEmail());//return exception when optional is null
//        System.out.println(optional1);
//
//        Optional<String> optional2 = Optional.ofNullable(obj.getEmail());//return empty when optional is null
//        System.out.println(optional2);

        Optional<String> optional3 = Optional.ofNullable(obj.getEmail());
        System.out.println(optional3.orElse("Optional is null"));

        Optional<String> optional4 = Optional.ofNullable(obj.getEmail());
        System.out.println(optional4.orElseGet(()->{
            return "Optional is null";
        }));

        Optional<String> optional5 = Optional.ofNullable(obj.getEmail());
        System.out.println(optional5.orElseThrow(() -> {
            return new Exception("In exception");
        }));

        Optional<String> optional6 = Optional.ofNullable(obj.getEmail());
        System.out.println(optional6.orElseThrow());


    }
}

class Employee {

    int id;
    String name;
    String email;

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}