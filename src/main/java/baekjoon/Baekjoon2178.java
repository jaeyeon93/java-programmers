package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Baekjoon2178 {
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
        int row = Integer.parseInt(input[ROW]);
        int col = Integer.parseInt(input[COL]);
        int [][] map = new int[row][col];
        for (int i = 0; i < row; i++) {
            String [] arr = sc.nextLine().split("");
            for (int j = 0; j < arr.length; j++)
                map[i][j] = Integer.parseInt(arr[j]);
        }
        System.out.println(bsf(map, row, col));
        System.out.println("=====");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(map[i][j]+ " ");
            System.out.println();
        }
        System.out.println(map[row-1][col-1]-1);
    }

    public static int bsf(int [][] map, int rowSize, int colSize) {
        boolean [][] visited = new boolean[rowSize][colSize];
        int count = 0;
        for (int row = 0; row < rowSize; row++)
            for (int col = 0; col < colSize; col++) {
                if (visited[row][col] || map[row][col] == 0) continue; // 방문했고, 값이 0이면 pass
                visited[row][col] = true;
                Queue<Point> q = new LinkedList<>();
                q.offer(new Point(row, col));
                while (!q.isEmpty()) {
                    Point current = q.poll();
                    for (final int [] DIRECTION : DIRECTIONS) {
                        int nextRow = current.row + DIRECTION[0];
                        int nextCol = current.col + DIRECTION[1];
                        if (nextRow < 0 || nextRow >= rowSize || nextCol < 0 || nextCol >= colSize) continue;
                        if (visited[nextRow][nextCol] || map[nextRow][nextCol] == 0) continue;
                        map[nextRow][nextCol] = ++map[current.row][current.col];
                        System.out.println("currnet : " + current.row + "," + current.col + " next : " + nextRow + "," + nextCol + " : " + map[nextRow][nextCol]);
                        visited[nextRow][nextCol] = true;
                        q.offer(new Point(nextRow, nextCol));

                    }
                }
            }
        return count;
    }
}
