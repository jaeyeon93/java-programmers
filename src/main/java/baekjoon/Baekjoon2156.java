package baekjoon;

import java.util.Scanner;

public class Baekjoon2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[10001];
        int [] dp = new int[10001];

        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-2] + arr[i], arr[i]+arr[i-1]+dp[i-3]);
            dp[i] = Math.max(dp[i], dp[i-1]);
        }

        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++)
            if (dp[i] > max) max = dp[i];
        System.out.println(max);
    }
}

// 반례 5 100 400 2 1 200 result 704