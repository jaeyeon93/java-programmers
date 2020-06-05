package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11048_DP {
    private static int [][] map;
    private static int [][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        dp = new int[n][m];

        for (int row = 0; row < n; row++) {
            st = new StringTokenizer(br.readLine());
            for (int col = 0; col < m; col++)
                map[row][col] = Integer.parseInt(st.nextToken());
        }
        if (n == 1 && m == 1) {
            System.out.println(map[n-1][m-1]);
            return;
        }
        //초기화
        dp[0][0] = map[0][0];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (row-1 < 0 && col -1 < 0) continue;
                if (row -1 < 0)
                    dp[row][col] = map[row][col] + dp[row][col-1];
                else if (col -1 < 0)
                    dp[row][col] = map[row][col] + dp[row-1][col];
                else
                    dp[row][col] = Math.max(dp[row-1][col], Math.max(dp[row][col-1], dp[row-1][col-1])) + map[row][col];
            }
        }

        System.out.println(dp[n-1][m-1]);
    }
}
