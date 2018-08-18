package book;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInputStreamEx {
    public static void main(String[] args) throws Exception {
        long start = 0;
        long end = 0;

        FileInputStream f1 = new FileInputStream("/Users/jaeyeonkim/Desktop/java-study/src/main/resources/io-1.jpg");
        start = System.currentTimeMillis();
        while (f1.read() != -1) {
        }
        end = System.currentTimeMillis();
        System.out.println("버퍼를 사용하지 않을 때 : " + (end - start) + "ms");
        f1.close();

        FileInputStream f2 = new FileInputStream("/Users/jaeyeonkim/Desktop/java-study/src/main/resources/io-1.jpg");
        BufferedInputStream bis = new BufferedInputStream(f2);
        start = System.currentTimeMillis();
        while (bis.read() != -1) {
        }
        end = System.currentTimeMillis();
        System.out.println("버퍼를 사용할 때 : " + (end - start) + "ms");
        bis.close();
        f2.close();
    }
}
