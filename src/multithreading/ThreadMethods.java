package multithreading;

public class ThreadMethods {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
//            System.out.println(Thread.currentThread().isAlive());
        });
//        t1.setName("T-1");
//        System.out.println(t1.getId());
        t1.setDaemon(true);
        System.out.println(t1.isDaemon());
//        System.out.println(t1.getState());
        t1.start();


        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t1.getPriority());
        System.out.println(t1.isAlive());

    }
}
