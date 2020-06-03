package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon2206 {
    private static int [][] arr = new int[1000][1000];
    private static int [][][] d = new int[1000][1000][2];
    private static final int [][] DIRECTIONS = {{0,1},{0,-1},{1,0},{-1,0}};
    private static final int ROW = 0, COL = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] mn = br.readLine().split(" ");
        // m is row n is col
        int m = Integer.parseInt(mn[0]);
        int n =Integer.parseInt(mn[1]);
        // 입력
        for (int row = 0; row < m; row++) {
            String [] lines = br.readLine().split("");
            for (int col = 0; col < n; col++) {
                arr[row][col] = Integer.parseInt(lines[col]);
            }
        }

        Queue<Point> q = new LinkedList<>();
        d[0][0][0] = 1;
        d[0][0][1] = 1;
        q.offer(new Point(0,0,0));

        while (!q.isEmpty()) {
            Point current = q.poll();
            if (current.row == m-1 && current.col == n-1) {
                break;
            }

            for (int [] DIRECTION : DIRECTIONS) {
                int nextRow = current.row + DIRECTION[ROW];
                int nextCol = current.col + DIRECTION[COL];
                int count = current.count;
                if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n) continue;

                // 다음이 빈칸이고, 벽부수는 횟수가 0
                if (arr[nextRow][nextCol] == 0 && d[nextRow][nextCol][count] == 0) {
                    d[nextRow][nextCol][count] = d[current.row][current.col][count]+1;
                    q.offer(new Point(nextRow, nextCol, count));
                }

                // 벽부순적이 없고, 다음이 벽일때
                if (count == 0 && arr[nextRow][nextCol] == 1 && d[nextRow][nextCol][count+1] == 0) {
                    d[nextRow][nextCol][count+1] = d[current.row][current.col][count]+1;
                    q.offer(new Point(nextRow,nextCol,count+1));
                }
            }
        }

        if (d[m-1][n-1][0] == 0 && d[m-1][n-1][1] == 0) {
            System.out.println(-1);
        } else if (d[m-1][n-1][0] != 0 && d[m-1][n-1][1] != 0) {
            System.out.println(Math.min(d[m-1][n-1][0], d[m-1][n-1][1]));
        } else if (d[m-1][n-1][0] != 0) {
            System.out.println(d[m-1][n-1][0]);
        } else
            System.out.println(d[m-1][n-1][1]);
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
