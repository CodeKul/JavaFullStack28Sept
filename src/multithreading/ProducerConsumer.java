package multithreading;

public class ProducerConsumer {
    int num;

    boolean flag = true;

    public synchronized void set(int num) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Set:" + num);
        this.num = num;
        flag = false;
        notify();
    }

    public synchronized void get() {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get:" + num);
        flag = true;
        notify();
    }
}

class Producer implements Runnable {

    ProducerConsumer producerConsumer;

    public Producer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {
        int num = 0;

        while (true) {
            producerConsumer.set(num++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {

    ProducerConsumer producerConsumer;

    public Consumer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
        Thread t2 = new Thread(this);
        t2.start();
    }

    @Override
    public void run() {
        while (true) {
            producerConsumer.get();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main1 {

    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Producer producer = new Producer(producerConsumer);
        Consumer consumer = new Consumer(producerConsumer);
    }
}