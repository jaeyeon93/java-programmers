package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon10026 {
    private static final int[][] DIRECTIONS = {{1,0},{-1,0},{0,1},{0,-1}};
    private static final int ROW = 0, COL = 1, RED = 0, GREEN = 1, BLUE = 2;
    private static int [] result = new int[2];

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

        for (int row = 0; row < size; row++) {
            String [] line = sc.nextLine().split("");
            for (int col = 0; col < size; col++) {
                if (line[col].equals("R"))
                    map[row][col] = RED;
                else if (line[col].equals("G"))
                    map[row][col] = GREEN;
                else
                    map[row][col] = BLUE;
            }
        }
        int [][] changeMap = changeColorMap(map, size);
        result[0] = bsf(map, size);
        result[1] = bsf(changeMap, size);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int bsf(int [][] map, int size) {
        boolean [][] visit = new boolean[size][size];
        int area = 0;
        for (int row = 0; row < size; row++)
            for (int col = 0; col < size; col++) {
                if (visit[row][col]) continue;
                Queue<Point> q = new LinkedList<>();
                q.offer(new Point(row, col));

                while (!q.isEmpty()) {
                    Point current = q.poll();
                    int currentValue = map[current.row][current.col];
                    for (final int [] DIRECTION : DIRECTIONS) {
                        int nextRow = current.row + DIRECTION[ROW];
                        int nextCol = current.col + DIRECTION[COL];
                        if (nextRow < 0 || nextCol < 0 || nextRow >= size || nextCol >= size) continue;
                        if (visit[nextRow][nextCol]) continue;
                        if (map[nextRow][nextCol] != currentValue) continue;
                        visit[nextRow][nextCol] = true;
                        q.offer(new Point(nextRow, nextCol));
                    }
                }
                area++;
            }
        return area;
    }

    private static int [][] changeColorMap(int [][] map, int size) {
        int [][] colorMap = new int[size][size];
        for (int row = 0; row < size; row++)
            for (int col = 0; col < size; col++)
                if (map[row][col] == GREEN)
                    colorMap[row][col] = RED;
                else
                    colorMap[row][col] = map[row][col];
        return colorMap;
    }
}
