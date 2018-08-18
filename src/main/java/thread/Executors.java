package thread;

import java.util.concurrent.ExecutorService;

public class Executors {
    public static void main(String[] args) {
        Runnable task = () -> {
            int n1 = 10;
            int n2 = 20;
            String name = Thread.currentThread().getName();
            System.out.println(name + " : " + (n1 + n2));
        };

        ExecutorService exr = java.util.concurrent.Executors.newSingleThreadExecutor();
        exr.submit(task);

        System.out.println("End " + Thread.currentThread().getName());
        exr.shutdown();
    }
}
