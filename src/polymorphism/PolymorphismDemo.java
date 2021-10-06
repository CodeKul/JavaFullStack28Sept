package polymorphism;

/**
 *
 * the ability to take  one form to many form
 *
 * or
 *
 * one thing have many actions
 *
 * method overloading-> if class have same method name but different number of parameter.
 *
 * Rule ->
 * changing the datatype  of  parameter you can achieve method  overloading
 * changing the return type you can achieve method  overloading
 *
 * advantage-> it increases the readability of program
 */


public class PolymorphismDemo {  //compile time polymorphism , static binding

    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,int b){
        return a+b;
    }

//    public void ASMD(int a,int b){
//        int sub = a-b;
//        int add = a+b;
//        System.out.println("add=>"+add);
//        System.out.println("sub=>"+ sub);
//        System.out.println("multi=>"+ a*b);
//        System.out.println("div=>"+ a/b);
//
//    }

    public static void main(String[] args) {
        PolymorphismDemo  obj = new PolymorphismDemo();
        System.out.println(obj.add(1,3));
        System.out.println(obj.add(1.9,2));
//        obj.ASMD(8,6);
    }

}
