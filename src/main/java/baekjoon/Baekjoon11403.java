package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11403 {
    private static int [][] map;
    private static int [][] result;
    private static boolean [] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        result = new int[n][n];
        visited = new boolean[n];

        for (int row = 0 ; row < n; row++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int col = 0; col < n; col++)
                map[row][col] = Integer.parseInt(st.nextToken());
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++)
                if (map[row][col] == 1) {
                    result[row][col] = 1;
                    dfs(row, col);
                    Arrays.fill(visited, false);
                }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }

    private static void dfs(int row, int col) {
        int [] rows = map[col];
        for (int i = 0; i < rows.length; i++) {
            if (rows[i] == 1 && !visited[i]) {
                result[row][i] = 1;
                visited[i] = true;
                dfs(row, i);
            }
        }
    }
}
