package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon2667 {
    private static final int [][] DIRECTIONS = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    private static final int ROW = 0, COL = 1;

    private static class Point {
        int col;
        int row;

        public Point(int col, int row) {
            this.col = col;
            this.row = row;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int [][] arr = new int[n][n];
        for (int row = 0; row < n; row++) {
            String [] temp = sc.nextLine().split("");
            for (int col = 0; col < n; col++)
                arr[row][col] = Integer.parseInt(temp[col]);
        }
        System.out.println(bsf(arr, n));
    }

    public static Integer bsf(int [][] arr, int n) {
        boolean [][] visit = new boolean[n][n];
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (visit[row][col] || arr[row][col] == 0) continue; // 만약에 방문을 했고, arr[row][col] = 0이면 pass
                visit[row][col] = true;
                Queue<Point> q = new LinkedList<>();
                q.offer(new Point(col, row));
                int count = 0;
                while (!q.isEmpty()) {
                    Point current = q.poll();

                    for (final int [] DIRECTION : DIRECTIONS) { // 4방향탐색
                        int nextRow = current.row + DIRECTION[ROW];
                        int nextCol = current.col + DIRECTION[COL];

                        if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n) continue;
                        if (visit[nextCol][nextRow]) continue;
                        count++;
                        visit[nextCol][nextRow] = true;
                        q.offer(new Point(col, row));
                    }
                }
                System.out.println(count);
            }
        }
        return 0;
    }
}
