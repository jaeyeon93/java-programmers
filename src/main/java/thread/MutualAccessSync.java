package thread;

public class MutualAccessSync {
    public static Counter cnt = new Counter();

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++)
                cnt.increament(); // increase number;
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++)
                cnt.decrement();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
        t1.join(); // t1이 참조하는 쓰레드의 종료를 기다림
        t2.join(); // t2가 참조하는 쓰레드의 종료를 기다림
        System.out.println(cnt.getCount());
    }
}
