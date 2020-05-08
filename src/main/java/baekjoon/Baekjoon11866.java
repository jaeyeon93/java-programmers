package baekjoon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++)
            q.offer(i);
        sb.append("<");
        while (!q.isEmpty()) {
            for (int i = 0; i < q.size(); i++) {
                for (int j = 0; j < k-1; j++)
                    q.offer(q.poll());
                sb.append(q.poll());
                sb.append(", ");
            }
        }
        String converting = sb.substring(0, sb.length()-2);
        sb = new StringBuilder(converting);
        sb.append(">");
        System.out.println(sb.toString());
    }
}
