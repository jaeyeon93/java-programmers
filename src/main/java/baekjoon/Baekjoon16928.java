package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon16928 {
    private static int [] dist = new int[101];
    private static int [] next = new int[101];

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            next[i] = i;
            dist[i] = -1;
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  = sc.nextInt();
        for (int i = 0; i < n+m; i++)
            next[sc.nextInt()] = sc.nextInt();

        dist[1] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);

        while (!q.isEmpty()) {
            int x = q.poll();
            for (int i = 1; i <= 6; i++) {
                int y = x+i;
                if (y > 100) continue;
                next[y] = y;

                if (dist[y] == -1) {
                    dist[y] = dist[x] + 1;
                    System.out.println("dist[x] : " + dist[x] + " dist[y] : " + dist[y]);

                    q.offer(y);
                }
            }
        }
        System.out.println(dist[100]);
        System.out.println(next[100]);
    }
}
