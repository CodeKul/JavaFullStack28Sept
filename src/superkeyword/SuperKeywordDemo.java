package superkeyword;

/**
 * super => 1. it refers the immediate parent class variable
 * 2. it refers the immediate parent class method.
 * 3. it refers the immediate parent class constructor
 */
public class SuperKeywordDemo {
    int i = 9;

    public void display() {
        System.out.println("In display parent");
    }
    public SuperKeywordDemo(){
        System.out.println("In parent const");
    }

    public SuperKeywordDemo(int i){
        System.out.println("In parent const parameter");
    }
}

class A extends SuperKeywordDemo {

    int i = 90;

    public A(){

        System.out.println("In child const");
    }

    public A(int i){
        super(2);
        System.out.println("In child const parameter");
    }

    public static void main(String[] args) {
        A obj = new A(1);
        obj.show();
//        obj.display();
    }

    @Override
    public void display() {
        super.display();
//        System.out.println("In child display");
    }

    public void show() {
//        System.out.println(super.i);
    }
}










