package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon1697 {
    private static int [] map = new int[100001];
    private static boolean [] visit = new boolean[100001];
    private static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();
        if (n == k) {
            System.out.println(0);
            return;
        }

        bsf(n);
        System.out.println(map[k]);
    }

    // 현재코드
    public static void bsf(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        while (!q.isEmpty()) {
            int current = q.poll();
            if (current == k) {
                break;
            }

            if (current-1 >= 0 && !visit[current-1]) {
                map[current-1] = map[current]+1;
                visit[current-1] = true;
                q.offer(current-1);
            }

            if (current+1 <= 100000 && !visit[current+1]) {
                map[current+1] = map[current]+1;
                visit[current+1] = true;
                q.offer(current+1);
            }

            if (current*2 <= 100000 && !visit[current*2]) {
                map[current*2] = map[current]+1;
                visit[current*2]= true;
                q.offer(current*2);
            }
        }
    }
    // 틀린코드
    public static void bsf2(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        while (!q.isEmpty()) {
            int current = q.poll();
            visit[current] = true;
            if (current == k) {
                break;
            }

            if (current-1 >= 0 && !visit[current-1]) {
                map[current-1] = map[current]+1;
                q.offer(current-1);
            }

            if (current+1 <= 100000 && !visit[current+1]) {
                map[current+1] = map[current]+1;
                q.offer(current+1);
            }

            if (current*2 <= 100000 && !visit[current*2]) {
                map[current*2] = map[current]+1;
                q.offer(current*2);
            }
        }
    }
}
