package multithreading;

public class ThreadPriority {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();

        obj2.setPriority(Thread.MAX_PRIORITY);
        obj.setPriority(1);

        obj.start();
        obj2.start();

    }
}

class A extends Thread {
    @Override
    public void run() {
        System.out.println("In a run ");
    }
}

class B extends Thread {
    @Override
    public void run() {
        System.out.println("In B run");
    }
}