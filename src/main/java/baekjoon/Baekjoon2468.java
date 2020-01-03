package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon2468 {
    private static int [][] DIRECTIONS = {{1,0},{-1,0},{0,1},{0,-1}};
    private static int ROW = 0, COL = 1;

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
        int size = Integer.parseInt(sc.nextLine());
        int [][] map = new int[size][size];
        int [] height = new int[101];
        for (int i = 0; i < size; i++) {
            String [] line = sc.nextLine().split(" ");
            for (int j = 0; j < size; j++)
                map[i][j] = Integer.parseInt(line[j]);
        }
        for (int i = 1; i < height.length; i++)
            height[i] = bsf(map, size, i);
        int max = height[1];
        for (int i = 2; i < height.length; i++)
            if (height[i] > max)
                max = height[i];
        System.out.println(max);
    }

    public static Integer bsf(int [][] map, int size, int height) {
        boolean [][] visit = new boolean[size][size];
        int result = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (map[row][col] < height) continue;
                if (visit[row][col]) continue;

                visit[row][col] = true;
                Queue<Point> q = new LinkedList<>();
                q.offer(new Point(row, col));
                result++;
                while (!q.isEmpty()) {
                    Point current = q.poll();
                    for (final int [] DIRECTION : DIRECTIONS) {
                        int nextRow = current.row + DIRECTION[ROW];
                        int nextCol = current.col + DIRECTION[COL];
                        if (nextRow < 0 || nextRow >= size || nextCol < 0 || nextCol >= size) continue;
                        if (visit[nextRow][nextCol]) continue;
                        if (map[nextRow][nextCol] < height) continue;
                        visit[nextRow][nextCol] = true;
                        q.offer(new Point(nextRow, nextCol));
                    }
                }
            }
        }
        return result;
    }
}
