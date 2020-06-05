package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon12761 {
    private static int a;
    private static int b;
    private static int n;
    private static int m;
    private static boolean [] visited = new boolean[100001];
    private static int MAX = 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        m = sc.nextInt();
        bsf(n, 0);
    }

    private static void bsf(int current, int startCount) {
        visited[current] = true;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(current, startCount));

        while (!q.isEmpty()) {
            Pair pair = q.poll();
            int count = pair.count;
            int next = pair.location;
            if (next == m) {
                System.out.println(pair.count);
                return;
            }

            if (next+1 <= MAX && !visited[next+1]) {
                visited[next+1] = true;
                q.offer(new Pair(next+1, count+1));
            }

            if (next-1 >= 0 && !visited[next-1]){
                visited[next-1] = true;
                q.offer(new Pair(next-1, count+1));
            }

            if (next+a <= MAX && !visited[next+a]) {
                visited[next+a] = true;
                q.offer(new Pair(next+a, count+1));
            }

            if (next+b <= MAX && !visited[next+b]) {
                visited[next+b] = true;
                q.offer(new Pair(next+b, count+1));
            }

            if (next-a >= 0 && !visited[next-a]) {
                visited[next-a] = true;
                q.offer(new Pair(next-a, count+1));
            }

            if (next-b >= 0 && !visited[next-b]) {
                visited[next-b] = true;
                q.offer(new Pair(next-b, count+1));
            }

            if (next*a <= MAX && !visited[next*a]) {
                visited[next*a] = true;
                q.offer(new Pair(next*a, count+1));
            }

            if (next*b <= MAX && !visited[next*b]) {
                visited[next*b] = true;
                q.offer(new Pair(next*b, count+1));
            }
        }
    }

    private static class Pair {
        int location;
        int count;

        public Pair(int location, int count) {
            this.location = location;
            this.count = count;
        }
    }
}
