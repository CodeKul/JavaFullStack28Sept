package java8;

public class MethodRefToCostructor{
    public static void main(String[] args) {
        //refer
        MyInterface5  myInterface5 = MethodRefToCostructor::new;
        //call
        myInterface5.methodRef();
    }

    public MethodRefToCostructor(){
        System.out.println("In constructor");
    }

}

interface MyInterface5{

    MethodRefToCostructor methodRef();
}