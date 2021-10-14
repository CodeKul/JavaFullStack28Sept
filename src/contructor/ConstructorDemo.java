package contructor;

/**
 * constructor => constructor is special type of function which automatically
 * invoke when object of class is created
 *
 * Rules =>
 * 1. your class name and constructor Name should be same.
 * 2.there should be no return type to constructor.
 * 3.final,static,synchronized keyword are not allowed.
 *
 * Types of constructor =>
 *         1.default constructor
 *         2.parameter constructor
 *
 *  use => it initializes variable to their default values
 */
public class ConstructorDemo {

    int i;

    public ConstructorDemo() {
        System.out.println("In constructor");
    }

    public ConstructorDemo(int i) {
        System.out.println("In constructor"+i);
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo(1);
        ConstructorDemo obj1 = new ConstructorDemo();
        System.out.println(obj.i);

    }
}
