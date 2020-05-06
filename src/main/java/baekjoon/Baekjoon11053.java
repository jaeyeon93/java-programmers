package baekjoon;

import java.util.Scanner;

public class Baekjoon11053 {
    private static int [] cost = new int[1001];
    private static int [] dp = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++)
            cost[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++)
                if (cost[j] < cost[i]) {
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                }
        }

        int max = 0;
        for (int i : dp)
            if (i > max) max = i;

        System.out.println(max);

    }
}
