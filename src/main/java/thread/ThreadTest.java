package thread;

public class ThreadTest extends Thread {
    static int count = 1;

    public void run() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        ThreadTest test1 = new ThreadTest();
        ThreadTest test2 = new ThreadTest();
        ThreadTest test3 = new ThreadTest();

        test1.start();
        test2.start();
        test3.start();
    }
}
