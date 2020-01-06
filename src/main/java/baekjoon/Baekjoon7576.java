package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon7576 {
    private static final int [][] DIRECTIONS = {{1,0},{0,1},{-1,0},{0,-1}};
    private static final int ROW = 0, COL = 1;

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
        String [] input = sc.nextLine().split(" ");
        int row = Integer.parseInt(input[1]);
        int col = Integer.parseInt(input[0]);
        int [][] map = new int[row][col];

        for (int i = 0; i < row; i++) {
            String [] line = sc.nextLine().split(" ");
            for (int j = 0; j < col; j++)
                map[i][j] = Integer.parseInt(line[j]);
        }
        int [][] result = bsf(map, row, col);
        int max = 0;
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                if (result[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, result[i][j]);
            }
        System.out.println(max-1);
    }

    private static int [][] bsf(int [][] map, int rowSize, int colSize) {
        boolean [][] visit = new boolean[rowSize][colSize];
        Queue<Point> q = new LinkedList<>();
        for (int row = 0; row < rowSize; row++)
            for (int col = 0; col < colSize; col++) {
                if (visit[row][col]) continue;
                if (map[row][col] == 0) continue;
                visit[row][col] = true;
                if (map[row][col] == 1)
                    q.offer(new Point(row, col));

            }
        while (!q.isEmpty()) {
            Point current = q.poll();
            for (final int [] DIRECTION : DIRECTIONS) {
                int nextRow = current.row + DIRECTION[0];
                int nextCol = current.col + DIRECTION[1];
                if (nextRow < 0 || nextCol < 0 || nextRow >= rowSize || nextCol >= colSize) continue;
                if (visit[nextRow][nextCol]) continue;
                if (map[nextRow][nextCol] == -1) continue;
                map[nextRow][nextCol] = map[current.row][current.col] + 1;
                visit[nextRow][nextCol] = true;
                q.offer(new Point(nextRow, nextCol));
            }
        }
        return map;
    }
}
