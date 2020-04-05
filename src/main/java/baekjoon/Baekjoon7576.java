package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon7576 {
    private static int [][] DIRECTIONS = {{0,1},{1,0},{0,-1},{-1,0}};
    private static int ROW = 0, COL = 1;
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
        String [] input = sc.nextLine().split(" ");
        int col = Integer.parseInt(input[0]);
        int row = Integer.parseInt(input[1]);
        int [][] map = new int[row][col];
        for (int i = 0; i < row; i++) {
            String [] arr = sc.nextLine().split(" ");
            for (int j = 0; j < arr.length; j++)
                map[i][j] = Integer.parseInt(arr[j]);
        }
        System.out.println(bsf(map, row, col));
        System.out.println("====");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
    }

    public static int bsf(int [][] map, int rowSize, int colSize) {
        boolean [][] visit = new boolean[rowSize][colSize];
        int count = 0;
        for (int row = 0; row < rowSize; row++)
            for (int col = 0; col < colSize; col++) {
                if (visit[row][col] || map[row][col] == 0) continue;
                visit[row][col] = true;
                Queue<Point> q = new LinkedList<>();
                q.offer(new Point(row, col));
                while (!q.isEmpty()) {
                    Point current = q.poll();
                    for (final int [] Direction : DIRECTIONS) {
                        int nextRow = current.row + Direction[ROW];
                        int nextCol = current.col + Direction[COL];
                        if (nextRow < 0 || nextRow >= rowSize || nextCol < 0 || nextCol >= colSize) continue;
                        if (visit[nextRow][nextCol]) continue;
                        if (map[nextRow][nextCol] == -1) {
                            continue;
                        }
                        if (map[nextRow][nextCol] == 0) {
                            map[nextRow][nextCol] = 1;
                            q.offer(new Point(nextRow, nextCol));
                        }
                        visit[nextRow][nextCol] = true;
                        map[nextRow][nextCol] = map[current.row][current.col] + 1;
                    }
                    count++;
                }
            }
        return count;
    }
}
