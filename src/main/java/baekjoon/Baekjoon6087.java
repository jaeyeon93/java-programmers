package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon6087 {
    private static int ROW = 0, COL = 1;
    private static int [][] DIRECTIONS = {{0,1},{1,0},{-1,0},{0,-1}};
    private static String [][] map;
    private static boolean [][] visit;
    private static int [][] path;
    private static int w, h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        map = new String[h][w];
        visit = new boolean[h][w];
        path = new int[h][w];
        for (int row = 0; row < h; row++) {
            String [] line = br.readLine().split("");
            for (int col = 0; col < w; col++) {
                map[row][col] = line[col];
            }
        }

        bsf();
    }

    private static void bsf() {
        Queue<Point> q = new LinkedList<>();
        for (int row = 0; row < h; row++) {
            for (int col = 0; col < w; col++) {
                if (map[row][col].equals("C")) {
                    visit[row][col] = true;
                    q.offer(new Point(row, col, map[row][col]));
                    while (!q.isEmpty()) {
                        Point current = q.poll();
                        for (int [] DIRECTION : DIRECTIONS) {
                            int nextRow = current.row + DIRECTION[ROW];
                            int nextCol = current.col + DIRECTION[COL];
                            if (nextRow < 0 || nextRow >= h || nextCol < 0 || nextCol >= w) continue;
                            if (visit[nextRow][nextCol]) continue;
                            if (map[nextRow][nextCol].equals("*")) continue;

                            System.out.println("nextRow : " + nextRow + " nextCol : " + nextCol + " value : " + map[nextRow][nextCol]);
                        }
                    }
                }
            }
        }
    }

    private static class Point {
        int row;
        int col;
        String str;

        public Point(int row, int col, String str) {
            this.row = row;
            this.col = col;
            this.str = str;
        }
    }
}
