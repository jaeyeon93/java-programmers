package baekjoon;

import java.util.LinkedList;
import java.util.Queue;

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
        int size = 10;
        int [][] map = new int[size][size];
        int [] start = {1,1};
        int [] dst = {1,1};
        int result = bsf(map, size, start, dst);
        System.out.println(result);
    }

    public static int bsf(int [][] map, int size, int [] start, int [] dst) {
        boolean [][] visit = new boolean[size][size];
        int startRow = start[ROW];
        int startCol = start[COL];
        map[startRow][startCol] = 0;
        int dstRow = dst[ROW];
        int dstCol = dst[COL];
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
                System.out.println("next : " + nextRow + "," + nextCol);
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
