package refresher_exercises;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();// starts a new thread
        System.out.println("This is the main thread.");
    }
}