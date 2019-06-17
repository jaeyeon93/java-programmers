package baekjoon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 1; i <= n; i++)
            dq.add(i);

        while (true) {
            if (dq.size() == 1)
                break;
            dq.pollFirst();
            dq.addLast(dq.pollFirst());
        }
        System.out.println(dq.getFirst());
    }
}
