package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon1149 {
    private static boolean [][] check = new boolean[1001][3];
    private static int [][] dp = new int[1001][3];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // 입력
        for (int i = 1; i <= n; i++) {
            String [] input = br.readLine().split(" ");
            dp[i][0] = Integer.parseInt(input[0]);
            dp[i][1] = Integer.parseInt(input[1]);
            dp[i][2] = Integer.parseInt(input[2]);
        }

        for (int i = 2; i <= n; i++) {
            dp[i][0] += Math.min(dp[i-1][1], dp[i-1][2]);
            dp[i][1] += Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] += Math.min(dp[i-1][0], dp[i-1][1]);
        }

        System.out.println(Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2])));
    }
}
