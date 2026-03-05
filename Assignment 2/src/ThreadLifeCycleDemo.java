
public class ThreadLifeCycleDemo {
    

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {

            System.out.println("Thread is running...");

            try {
                Thread.sleep(1000);   
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread execution completed.");
        });

        System.out.println("State after thread creation: " + t1.getState());

        t1.start();
        System.out.println("State after start(): " + t1.getState());

        Thread.sleep(100);
        System.out.println("State during sleep(): " + t1.getState());

        t1.join();

        System.out.println("State after completion: " + t1.getState());
    }

}
