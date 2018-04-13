package yoon;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequqCollection {
    public static void main(String[] args) {
        Deque<String> deq = new ArrayDeque<>();

        // 앞으로넣고
        deq.offerFirst("1.Box");
        deq.offerFirst("2.Toy");
        deq.offerFirst("3.Robot");

        // 앞에서 꺼내기
        System.out.println(deq.poll());
        System.out.println(deq.poll());
        System.out.println(deq.poll());
    }
}
