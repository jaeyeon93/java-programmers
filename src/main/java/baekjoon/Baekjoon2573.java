package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon2573 {
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
        int rowSize = Integer.parseInt(input[0]);
        int colSize = Integer.parseInt(input[1]);
        int [][] map = new int[rowSize][colSize];
        for (int row = 0; row < rowSize; row++) {
            String [] line = sc.nextLine().split(" ");
            for (int col = 0; col < colSize; col++)
                map[row][col] = Integer.parseInt(line[col]);
        }
        int year = 0;
        System.out.println(bsf(map, rowSize, colSize));
    }
    private static int bsf(int [][] map, int rowSize, int colSize) {
        boolean[][] visit = new boolean[rowSize][colSize];
        Queue<Point> q = new LinkedList<>();
        int count = 0;
        for (int row = 0; row < rowSize; row++)
            for (int col = 0; col < colSize; col++) {
                if (map[row][col] == 0) continue;
                if (visit[row][col]) continue;
                visit[row][col] = true;
                count++;
                q.offer(new Point(row, col));
                while (!q.isEmpty()) {
                    Point current = q.poll();
                    for (final int [] DIRECTION : DIRECTIONS) {
                        int nextRow = current.row + DIRECTION[ROW];
                        int nextCol = current.col + DIRECTION[COL];
                        if (nextRow < 0 || nextCol < 0 || nextRow >= rowSize || nextCol >= colSize) continue;
                        if (visit[nextRow][nextCol]) continue;
                        System.out.println("current : " + current.row + "," + current.col + " next : " + nextRow + "," + nextCol + " value : " + map[current.row][current.col] + " next value : " + map[nextRow][nextCol]);
                        if (map[nextRow][nextCol] == 0 && map[current.row][current.col] > 0) {
                            map[current.row][current.col] = map[current.row][current.col] - 1;
                        }
                        visit[nextRow][nextCol] = true;
                        q.offer(new Point(nextRow, nextCol));
                    }
                }
            }

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
        return count;
    }
}

/*
5 5
0 0 0 0 0
0 6 9 6 0
0 3 3 9 0
0 6 1 6 0
0 0 0 0 0
반례
output : 4
 */