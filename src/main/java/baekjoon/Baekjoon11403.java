package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11403 {
    private static int n;
    private static int [][] map;
    private static boolean [][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visit = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (map[row][col] == 1 && !visit[row][col])
                    dfs(row, row, col);
            }
        }

        System.out.println("===");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
    }

    public static void dfs(int top, int row, int col) {
        map[top][row] = 1;
        visit[row][col] = true;

        for (int i = 0; i < n; i++) {
            if (map[top][i] == 1 && !visit[top][i])
                dfs(top, row, i);
        }
    }
}
