package thread;

public class MakeThreadMulti {
    public static void main(String[] args) {
        Runnable task = () -> { // 20미만의 짝수
            for (int i = 0; i < 20; i++)
                if (i % 2 == 0)
                    System.out.print(i + " ");
        };

        Runnable task2 = () -> { // 20미만의 홀수
            for (int i = 0; i < 20; i++)
                if (i % 2 == 1)
                    System.out.print(i + " ");
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
    }
}
