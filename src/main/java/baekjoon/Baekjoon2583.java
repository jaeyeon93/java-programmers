package baekjoon;

import java.util.*;

public class Baekjoon2583 {
    private static final int [][] DIRECTIONS = {{0,1},{0,-1},{1,0},{-1,0}};
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
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        int [][] map = new int[m][n];
        List<Integer> result = new ArrayList<>();
        for (int row = 0; row < m; row++)
            for (int col = 0; col < n; col++)
                map[row][col] = 0;

        for (int t = 0; t < k; t++) {
            String [] line = sc.nextLine().split(" ");
            int xStart = Integer.parseInt(line[0]);
            int yStart = Integer.parseInt(line[1]);
            int xEnd = Integer.parseInt(line[2]);
            int yEnd = Integer.parseInt(line[3]);
            for (int y = yStart; y < yEnd; y++)
                for (int x = xStart; x < xEnd; x++)
                    map[y][x] = 1;
        }

        System.out.println(bsf(map, m, n, result));
    }

    private static List<Integer> bsf(int [][] map, int m, int n, List<Integer> result) {
        System.out.println("====");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++)
                System.out.print(map[row][col] + " ");
            System.out.println();
        }
        System.out.println("====");

        boolean [][] visit = new boolean[m][n];
        Queue<Point> q = new LinkedList<>();
        for (int row = 0; row < m; row++)
            for (int col = 0; col < n; col++) {
                int count = 0;
                if (visit[row][col] || map[row][col] == 0) continue;
                visit[row][col] = true;
                System.out.println(row + "," + col + " value : " + map[row][col]);
                q.offer(new Point(row, col));
                while (!q.isEmpty()) {
                    Point current = q.poll();
//                    int count = 0;
                    for (final int [] DIRECTION : DIRECTIONS) {
                        int nextRow = current.row + DIRECTION[ROW];
                        int nextCol = current.col + DIRECTION[COL];
                        if (nextRow < 0 || nextCol < 0 || nextRow >= m || nextCol >= n) continue;
                        if (visit[nextRow][nextCol] || map[nextRow][nextCol] == 0) continue;
                        visit[nextRow][nextCol] = true;
                        ++count;
                        q.offer(new Point(nextRow, nextCol));
                    }
                    System.out.println("count : " + count);
            }
        }
        return result;
    }
}
