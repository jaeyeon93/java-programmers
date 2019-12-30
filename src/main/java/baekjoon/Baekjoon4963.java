package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/4963
public class Baekjoon4963 {
    private final static int [][] DIRECTIONS = {{0,1},{1,0},{0,-1},{-1,0}, {1,1}, {-1,-1},{1,-1},{-1,1}};
    private final static int ROW = 0, COL = 1;

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
        while (true) {
            String [] input = sc.nextLine().split(" ");
            int col = Integer.parseInt(input[0]);
            int row = Integer.parseInt(input[1]);

            if (col == 0 && row == 0)
                break;

            int [][] map = new int[row][col];
            for (int i = 0; i < row; i++) {
                String [] rows = sc.nextLine().split(" ");
                for (int j = 0; j < col; j++)
                    map[i][j] = Integer.parseInt(rows[j]);
            }
            System.out.println(bsf(map, row, col));
        }

    }

    public static Integer bsf(int [][] map, int rowSize, int colSize) {
        boolean [][] visit = new boolean[rowSize][colSize];
        int count = 0;
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                if (visit[row][col] || map[row][col] == 0) continue;
                visit[row][col] = true;
                count++;
                Queue<Point> q = new LinkedList<>();
                q.offer(new Point(row, col));
                while (!q.isEmpty()) {
                    Point current = q.poll();
                    for (final int [] DIRECTION : DIRECTIONS) {
                        int nextRow = current.row + DIRECTION[ROW];
                        int nextCol = current.col + DIRECTION[COL];
                        if (nextRow < 0 || nextRow >= rowSize || nextCol < 0 || nextCol >= colSize) continue;
                        if (visit[nextRow][nextCol] || map[nextRow][nextCol] == 0) continue;
                        visit[nextRow][nextCol] = true;
                        q.offer(new Point(nextRow, nextCol));
                    }
                }
            }
        }
        return count;
    }
}
