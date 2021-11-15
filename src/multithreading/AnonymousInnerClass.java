package multithreading;

public class AnonymousInnerClass {

    public static void main(String[] args) {

        MyInterface obj =  (int a, int b) ->{
                return a+b;
        };

        System.out.println(obj.add(2,3));
    }
}

@FunctionalInterface
interface MyInterface{

    Integer add(int a,int b);

}