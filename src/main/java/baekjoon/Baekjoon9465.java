package baekjoon;

import java.io.*;

public class Baekjoon9465 {
    public static int solution(int [][] arr, int size) {
        int [][] dp = new int[2][size];
        dp[0][0] = arr[0][0];
        dp[1][0] = arr[1][0];
        if (size == 1)
            return Math.max(dp[0][0], dp[1][0]);
        dp[0][1] = arr[0][1] + dp[1][0];
        dp[1][1] = arr[1][1] + dp[0][0];
        if (size == 2)
            return Math.max(dp[0][1], dp[1][1]);

        for (int i = 2; i < size; i++) {
            dp[0][i] = Math.max(dp[1][i-1], Math.max(dp[0][i-2], dp[1][i-2])) + arr[0][i];
            dp[1][i] = Math.max(dp[0][i-1], Math.max(dp[0][i-2], dp[1][i-2])) + arr[1][i];
        }

        return Math.max(dp[0][size-1], dp[1][size-1]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int size = Integer.parseInt(br.readLine());
            int [][] arr = new int[2][size];
            String [] first = br.readLine().split(" ");
            for (int j = 0; j < first.length; j++)
                arr[0][j] = Integer.parseInt(first[j]);

            String [] second = br.readLine().split(" ");
            for (int j = 0; j < second.length; j++)
                arr[1][j] = Integer.parseInt(second[j]);
            int result = solution(arr, size);
            bw.write(result+"\n");
        }
        bw.flush();
    }
}
