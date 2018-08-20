package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class MultiThreadSynchronize {
    private int index = 0;

    public int getMax() {
        synchronized (this) {
            index++;
            return index;
        }
    }

//    private AtomicInteger atomicInt = new AtomicInteger();
//
//    public int getMax() {
//        return atomicInt.incrementAndGet();
//    }

    public static void main(String[] args) {
        MultiThreadSynchronize synchronize = new MultiThreadSynchronize();
        new SyncThread(synchronize).start();
        new SyncThread(synchronize).start();
        new SyncThread(synchronize).start();
    }
}

class SyncThread extends Thread {
    private MultiThreadSynchronize synchronize;

    public SyncThread(MultiThreadSynchronize synchronize) {
        this.synchronize = synchronize;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        int max = synchronize.getMax();
        while (max < 1000) {
            System.out.println(max);
            max = synchronize.getMax();
        }
        long end = System.currentTimeMillis();
        System.out.println("execution time : " + (end - start));
    }
}
