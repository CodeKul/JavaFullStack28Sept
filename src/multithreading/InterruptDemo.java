package multithreading;

public class InterruptDemo extends Thread {

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("In run");
           try {
                 Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {

        InterruptDemo  obj = new InterruptDemo();
        obj.start();
        obj.interrupt();
        System.out.println("In Main thread");
    }
}
