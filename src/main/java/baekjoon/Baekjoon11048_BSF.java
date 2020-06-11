package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon11048_BSF {
    private static int [][] map;
    private static int [][] sum;
    private static final int ROW = 0, COL = 1;
    private static int [][] DIRECTIONS = {{1,0}, {0,1}, {1,1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        sum = new int[n][m];

        for (int row = 0; row < n; row++) {
            st = new StringTokenizer(br.readLine());
            for (int col = 0; col < m; col++)
                map[row][col] = Integer.parseInt(st.nextToken());
        }
        // 초기값
        sum[0][0] = map[0][0];

        // 순회
        for (int row = 0; row < n; row++) {
            Queue<Point> q = new LinkedList<>();
            for (int col = 0; col < m; col++) {
                    q.offer(new Point(row, col));
                    while (!q.isEmpty()) {
                        Point current = q.poll();
                        for (int [] DIRECTION : DIRECTIONS) {
                            int nextRow = current.row + DIRECTION[ROW];
                            int nextCol = current.col + DIRECTION[COL];
                            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= m) continue;
                            int temp = sum[current.row][current.col] + map[nextRow][nextCol];
                            if (sum[nextRow][nextCol] < temp)
                                sum[nextRow][nextCol] = temp;
                            q.offer(new Point(nextRow, nextCol));
                        }
                    }
            }
        }

    }

    private static class Point {
        int row;
        int col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
