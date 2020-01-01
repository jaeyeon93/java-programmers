package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon7562 {
    private static final int [][] DIRECTIONS = {{1,2},{2,1},{-1,2},{-2,1},{-1,-2},{-2,-1},{1,-2},{2,-1}};
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
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            int size = Integer.parseInt(sc.nextLine());
            int [][] map = new int[size][size];
            String [] start = sc.nextLine().split(" ");
            String [] dst = sc.nextLine().split(" ");
            System.out.println(bsf(map, size, start, dst));
        }
    }

    public static int bsf(int [][] map, int size, String [] start, String [] dst) {
        boolean [][] visit = new boolean[size][size];
        int startRow = Integer.parseInt(start[ROW]);
        int startCol = Integer.parseInt(start[COL]);
        map[startRow][startCol] = 0;
        int dstRow = Integer.parseInt(dst[ROW]);
        int dstCol = Integer.parseInt(dst[COL]);
        if (startRow == dstRow && startCol == dstCol)
            return 0;
        visit[startRow][startCol] = true;
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(startRow, startCol));
        while (!q.isEmpty()) {
            Point current = q.poll();
            for (final int [] DIRECTION : DIRECTIONS) {
                int nextRow = current.row + DIRECTION[ROW];
                int nextCol = current.col + DIRECTION[COL];
                if (nextRow < 0 || nextRow >= size || nextCol < 0 || nextCol >= size) continue;
                if (visit[nextRow][nextCol]) continue;
                visit[nextRow][nextCol] = true;
                if (nextRow == dstRow && nextCol == dstCol) {
                    map[nextRow][nextCol] = map[current.row][current.col]+1;
                    return map[nextRow][nextCol];
                }
                map[nextRow][nextCol] = map[current.row][current.col]+1;
                q.offer(new Point(nextRow, nextCol));
            }
        }
        return 0;
    }
}
