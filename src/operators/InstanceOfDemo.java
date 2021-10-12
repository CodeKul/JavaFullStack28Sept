package operators;
/*
we are adding special behavior to class using marker interface
 */
interface MyInterface{

}

public class InstanceOfDemo {

    public void  show(){
        System.out.println("In show");
    }

    public static void main(String[] args) {

        InstanceOfDemo obj = new InstanceOfDemo();
        if(obj  instanceof MyInterface){
            obj.show();
        }
    }
}
