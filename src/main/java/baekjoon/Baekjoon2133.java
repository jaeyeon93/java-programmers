package baekjoon;

import java.util.Scanner;

public class Baekjoon2133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 0;
        dp[2] = 3;
        dp[3] = 0;
        for (int i = 4; i <= n; i += 2) {
            dp[i] = dp[i-2]*3;
            for (int j = 4; j <= i; j += 2)
                dp[i] += dp[i-j]*2;
        }
        System.out.println(dp[n]);

    }
}
