package baekjoon;

import java.util.*;

public class Baekjoon5567 {
    private static int [][] arr = new int[501][501];
    private static boolean [] visited = new boolean[501];
    private static List<Integer> result = new ArrayList<>();
    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            arr[from][to] = 1;
            arr[to][from] = 1;
        }
        bfs();
        System.out.println(result.size());
    }

    static class Point {
        int from;
        int to;

        Point(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    private static void bfs() {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(1, 0));
        visited[1] = true;

        while (!queue.isEmpty()) {
            Point poll = queue.poll();
            for (int i = 1; i <= n; i++) {
                if (arr[poll.from][i] == 1 && !visited[i] && poll.to < 2) {
                    result.add(i);
                    visited[i] = true;
                    queue.add(new Point(i, poll.to+1));
                }
            }
        }
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [][] arr = new int[n+1][n+1];
//        boolean [] visit = new boolean[n+1];
//        int m = sc.nextInt();
//
//        for (int i = 0; i < m; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            arr[a][b] = 1;
//            arr[b][a] = 1;
//        }
//        int answer = 0;
//
//        //상근이와 직접적인 친구
//        for (int i = 2; i <= n; i++) {
//            if (arr[1][i] == 1) {
//                //상근이 직접친구
//                if (!visit[i]) {
//                    answer++;
//                    visit[i] = true;
//                }
//
//                // 상근이 친구의 친구
//                for (int j = 2; j <= n; j++) {
//                    if (arr[i][j] == 1 && !visit[j]) {
//                        answer++;
//                        visit[j] = true;
//                    }
//                }
//            }
//        }
//        System.out.println(answer);
//    }
}
