package thread;

class Task extends Thread {
    public void run() {
        // Thread의 run을 오버라딩
        int n1 = 10;
        int n2 = 20;
        String name = Thread.currentThread().getName();
        System.out.println(name + " : " + (n1 + n2));
    }
}

public class MakeThread2 {
    public static void main(String[] args) {
        Task t1 = new Task();
        Task t2 = new Task();
        Task t3 = new Task();
        Task t4 = new Task();
        Task t5 = new Task();
        Task t6 = new Task();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        System.out.println("End " + Thread.currentThread().getName());
    }
}
