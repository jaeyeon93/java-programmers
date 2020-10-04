package baekjoon;

import java.util.Scanner;

public class Baekjoon1932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [][] arr = new int[size+1][size+1];
        for (int i = 1; i <= size; i++)
            for (int j = 1; j <= i; j++)
                arr[i][j] = sc.nextInt();

        int [][] dp = new int[size+1][size+1];
        dp[1][1] = arr[1][1];
        if (size == 1) {
            System.out.println(arr[1][1]);
            return;
        }

        for (int i = 2; i <= size; i++) {
            dp[i][1] = dp[i-1][1] + arr[i][1];
            dp[i][i] = dp[i-1][i-1] + arr[i][i];
            for (int j = 2; j < i; j++) {
                dp[i][j] = Math.max((dp[i-1][j-1] + arr[i][j]), (dp[i-1][j] + arr[i][j]));
            }
        }

        int max = 0;
        for (int i = 1; i <= size; i++)
            if (dp[size][i] > max)
                max = dp[size][i];
        System.out.println(max);
    }
}
