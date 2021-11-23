package multithreading;

public class DaomonDemo extends Thread{

    public static void main(String[] args) {

//        Thread.currentThread().setDaemon(true);
        DaomonDemo obj = new DaomonDemo();
        obj.setDaemon(true);
        obj.start();


        System.out.println(obj.isDaemon());
        System.out.println("In  main   thread");

    }

    @Override
    public void run() {
        System.out.println("In run method");
    }
}
