package multithreading;

public class DeadLock {

    public static void main(String[] args) {

        String resource1 = "Printer";
        String resource2 = "Scanner";
        String resource3 = "Charger";

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " Locked " + resource1);
                System.out.println();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println();
                    System.out.println(Thread.currentThread().getName() + " Locked " + resource2);
                }

                synchronized (resource3) {
                    System.out.println();
                    System.out.println(Thread.currentThread().getName() + " Locked " + resource3);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println();
                System.out.println(Thread.currentThread().getName() + " Locked " + resource2);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource3) {
                    System.out.println();
                    System.out.println(Thread.currentThread().getName() + " Locked " + resource3);

                }
            }
            synchronized (resource1) {
                System.out.println();
                System.out.println(Thread.currentThread().getName() + " Locked " + resource1);
            }
        });

        t1.setName("Laptop");
        t2.setName("Desktop");

        t1.start();
        t2.start();

    }
}
