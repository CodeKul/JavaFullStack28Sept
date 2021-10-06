package basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectWays {

//    Object[] i = { 1,"a",'e',8.0};
    String[] str = {"str","str1"};


    public static void main(String[] args)
            throws InstantiationException,
            IllegalAccessException, NoSuchMethodException,
            InvocationTargetException {

        ObjectWays obj  = new ObjectWays();
        obj.show();

        ObjectWays obj1 = ObjectWays.class.newInstance();
        obj1.show();

        Constructor<ObjectWays> obj2 = ObjectWays.class.getConstructor();
        ObjectWays objectWays = obj2.newInstance();
        objectWays.show();

        main("a");
    }

    public String show() {
        System.out.println("in show");
        System.out.println("in show");
        System.out.println("in show");
       return "Hii";
    }



    public static int main(String args) {
        return 1;
    }
    public void display(){

    }
}
