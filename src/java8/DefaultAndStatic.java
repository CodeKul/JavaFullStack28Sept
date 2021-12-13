package java8;

public class DefaultAndStatic implements MyInterface6,MyInterface7{
    public static void main(String[] args) {

        DefaultAndStatic obj = new DefaultAndStatic();
        System.out.println(obj.add(4,4));
//        System.out.println(MyInterface6.display());
    }

    @Override
    public String msg() {
        return "msg";
    }

    @Override
    public int add(int i, int j) {
        return MyInterface6.super.add(i, j);
    }
}

interface MyInterface6{
    String msg();

    private void sub(){
        System.out.println("In sub method");
    }

    default int add(int i,int j){
        return i+j;
    }

    static String display(){
        return "In display method";
    }

}

interface MyInterface7{
    default int add(int i,int j){
        return i+j;
    }
}