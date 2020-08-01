package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon7569 {
    private static int col, row, h;
    private static int [][][] map;
    private static boolean [][][] visit;
    private static int [][][] dist;

    static int[] dx = { -1, 0, 1, 0, 0, 0 };
    static int[] dy = { 0, 1, 0, -1, 0, 0 };
    static int[] dz = { 0, 0, 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        map = new int[h][row][col];
        visit = new boolean[h][row][col];
        dist = new int[h][row][col];

        for (int k = 0; k < h; k++) {
            for (int i = 0; i < row; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < col; j++) {
                    map[k][i][j] = Integer.parseInt(st.nextToken());
                }
            }
        }
        bsf();
        int day = Integer.MIN_VALUE;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++)
                    if (map[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    } else if (map[i][j][k] > day) day = map[i][j][k];
            }
        }

        System.out.println(day-1);
    }

    private static void bsf() {
        Queue<Point> q = new LinkedList<>();
        for (int height = 0; height < h; height++) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (map[height][i][j] == 1) {
                        q.offer(new Point(height, i, j));
                    }
                }
            }
        }

        while (!q.isEmpty()) {
            Point current = q.poll();
            visit[current.height][current.row][current.col] = true;
            dist[current.height][current.row][current.col] = 1;
            for (int x = 0; x < dx.length; x++) {
                int nextHeight = current.height + dz[x];
                int nextRow = current.row + dx[x];
                int nextCol = current.col + dy[x];
                if (nextRow < 0 || nextRow >= row || nextCol < 0 || nextCol >= col || nextHeight < 0 || nextHeight >= h) continue;
                if (visit[nextHeight][nextRow][nextCol]) continue;
                if (map[nextHeight][nextRow][nextCol] == -1 || map[nextHeight][nextRow][nextCol] != 0) continue;
                map[nextHeight][nextRow][nextCol] = map[current.height][current.row][current.col] + 1;
                q.offer(new Point(nextHeight, nextRow, nextCol));
            }

        }
    }

    private static class Point {
        int height;
        int row;
        int col;

        public Point(int height, int row, int col) {
            this.height = height;
            this.row = row;
            this.col = col;
        }
    }
}
