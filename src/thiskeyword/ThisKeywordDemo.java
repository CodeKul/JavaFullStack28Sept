package thiskeyword;

import operators.OperatorsDemo;

/**
 * This =>  1. this keyword is used to refer current class instance variable
 *          2. this keyword is used to refer current class methods.
 *          3. this keyword is used to call constructor
 */
public class ThisKeywordDemo {

    private int id;
    private String name;
    private String address;

    public static void main(String[] args) {
        ThisKeywordDemo obj = new ThisKeywordDemo();
        obj.setValues(1, "Prakash", "Nagpur");

        System.out.println("id=>" + obj.id + " name=>" + obj.name + " address=>" + obj.address);
        obj.display();
    }

    public void setValues(int id1, String name1, String address1) {
        id = 1;
        name = name1;
        address = address1;
    }

    public void show() {
        System.out.println("In show function");
    }

    public void display() {
        this.show();
    }

    public ThisKeywordDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public ThisKeywordDemo(){
        this(1,"rahul","pune");
        System.out.println("In default constructor");
    }
}
