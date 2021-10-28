package exceptionhandling;

public class StackOverFlowError {
    public static void main(String[] args) {
        StackOverFlow(3);
    }

    public static void StackOverFlow(int i){
        System.out.println("num=>"+i);
        if(i==0){
            return;
        }else {
            StackOverFlow(i);
        }
    }
}
