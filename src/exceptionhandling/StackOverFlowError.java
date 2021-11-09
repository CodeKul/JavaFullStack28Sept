package exceptionhandling;

public class StackOverFlowError {
    public static void main(String[] args) {
        recursion(5);
    }

    public static void recursion(int i){
        System.out.println("i=>"+i);
        if(i==0){
            return;
        }else {
            recursion(i);
        }
    }
}
