package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon14442 {
    private static int [][] arr = new int[1001][1001];
    private static int [][][] d = new int[1001][1001][11];
    private static final int [][] DIRECTIONS ={{1,0},{0,1},{-1,0},{0,-1}};
    private static final int ROW = 0, COL = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] firstLine = sc.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        int k = Integer.parseInt(firstLine[2]);

        // Input
        for (int row = 0; row < n; row++) {
            String [] line = sc.nextLine().split("");
            for (int col = 0; col < m; col++)
                arr[row][col] = Integer.parseInt(line[col]);
        }
        d[0][0][0] = 1;
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0,0,0));
        while (!q.isEmpty()) {
            Point current = q.poll();

            // 목적지에 도착했을때
            if (current.row == n-1 && current.col == m-1) {
                break;
            }

            // 탐색
            for (int [] DIRECTION : DIRECTIONS) {
                int nextRow = current.row + DIRECTION[ROW];
                int nextCol = current.col + DIRECTION[COL];
                int count = current.count;

                if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= m) continue;

                //벽을 안부실때
                if (arr[nextRow][nextCol] == 0 && d[nextRow][nextCol][count] == 0) {
                    d[nextRow][nextCol][count] = d[current.row][current.col][count] + 1;
                    q.offer(new Point(nextRow, nextCol, count));
                }

                // 벽을 뿌실때
                if (arr[nextRow][nextCol] == 1 && count+1 <= k && d[nextRow][nextCol][count+1] == 0) {
                    d[nextRow][nextCol][count+1] = d[current.row][current.col][count] + 1;
                    q.offer(new Point(nextRow, nextCol, count+1));
                }
            }
        }

        // 최단거리 찾기
        int ans = -1;
        for (int i = 0; i <= 10; i++) {
            int currentValue = d[n-1][m-1][i];
            if (currentValue != 0 && currentValue > ans)
                ans = currentValue;
            else if (ans != -1 && currentValue < ans && currentValue != 0)
                ans = currentValue;
        }
        System.out.println(ans);
    }

    private static class Point {
        int row;
        int col;
        int count;

        public Point(int row, int col, int count) {
            this.row = row;
            this.col = col;
            this.count = count;
        }
    }
}
