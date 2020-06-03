package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon16948 {
    private static final int [][] DIRECTIONS = {{-2,-1}, {-2,1}, {0,-2},{0,2},{2,-1},{2,1}};
    private static final int ROW = 0, COL = 1;
    private static int [][] dist;
    private static boolean [][] visit;
    private static class Point {
        int row;
        int col;

        Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dist = new int[n][n];
        visit = new boolean[n][n];

        Queue<Point> q = new LinkedList<>();
        Point start = new Point(sc.nextInt(), sc.nextInt());
        Point des = new Point(sc.nextInt(), sc.nextInt());
        q.offer(start);

        while (!q.isEmpty()) {
            Point current = q.poll();

            // 찾았을때.
            if (current.row == des.row && current.col == des.col) {
                System.out.println(dist[current.row][current.col]);
                return;
            }
            for (int [] DIRECTION : DIRECTIONS) {
                int nextRow = current.row + DIRECTION[ROW];
                int nextCol = current.col + DIRECTION[COL];

                if (0 <= nextRow && nextRow < n && 0 <= nextCol && nextCol < n) {
                    if (visit[nextRow][nextCol]) continue;

                    visit[nextRow][nextCol] = true;
                    q.offer(new Point(nextRow, nextCol));
                    dist[nextRow][nextCol] = dist[current.row][current.col]+1;
                }
            }
        }

        // 모두 다 탐색하고 못찾을때
        if (dist[des.row][des.col] == 0) {
            System.out.println(-1);
            return;
        }
    }

}
