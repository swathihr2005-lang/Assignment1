class Counter {

    private int count = 0;

    // synchronized method
    public synchronized void increment() {
        count++;
    }

    public int count() {
        return count;
    }
}

class MyThread extends Thread {

    Counter counter;

    // Constructor
    MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}


public class SynchronizationDemo {
      public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        
        t1.join();
        t2.join();

        System.out.println("Final Counter Value: " + counter.count());
    }
}
