package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Baekjoon1012 {
    private static final int [][] DIRECTIONS = {{1,0}, {-1,0},{0,1},{0,-1}};
    private static final int ROW = 0, COL = 1; // Direction을 foreach로 불러오는데, Directions[ROW][COL]을 불러오는거다.

    private static class Point {
        int row;
        int col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int K = sc.nextInt();
            boolean [][] map = new boolean [M][N];
            for (int j = 0; j < K; j++)
                map[sc.nextInt()][sc.nextInt()] = true;
            System.out.println(bfs(map, M, N));
        }
    }

    private static int bfs(boolean [][] map, int m, int n) {
        boolean [][] visit = new boolean[m][n];
        int count = 0;
        for (int row = 0; row < m; row++)
            for (int col = 0; col < n; col++) {
                if (visit[row][col] || !map[row][col]) continue;
                count++;
                visit[row][col] = true;
                Queue<Point> q = new LinkedList<>();

                q.offer(new Point(row, col));

                while (!q.isEmpty()) {
                    Point current = q.poll();

                    // 4방향으로 퍼져나가는 부분
                    for (final int [] DIRECTION : DIRECTIONS) {
                        int nextRow = current.row + DIRECTION[ROW];
                        int nextCol = current.col + DIRECTION[COL];

                        if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n) continue;
                        if (visit[nextRow][nextCol]) continue;
                        if (!map[nextRow][nextCol]) continue;

                        visit[nextRow][nextCol] = true;
                        q.offer(new Point(nextRow, nextCol));
                    }
                }
            }
        return count;
    }
}
