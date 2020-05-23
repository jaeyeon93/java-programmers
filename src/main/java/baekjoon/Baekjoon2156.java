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


        if (n == 1) {
            System.out.println(arr[1]);
            return;
        } else if (n == 2) {
            System.out.println(arr[1] + arr[2]);
            return;
        } else {
            dp[1] = arr[1];
            dp[2] = arr[2] + dp[1];
            dp[3] = Math.max(dp[2],Math.max(arr[1]+arr[3], arr[2]+arr[3]));
            for (int i = 4; i <= n; i++) {
                dp[i] = Math.max(dp[i-3] + arr[i] + arr[i-1], dp[i-2] + arr[i]);
                dp[i] = Math.max(dp[i], dp[i-1]);
            }
        }



        int max = 0;
        for (int i = 1 ; i<= n; i++) {
            if (dp[i] > max)
                max = dp[i];
            System.out.println(dp[i]);
        }

        System.out.println(max);
    }
}

// 반례 5 100 400 2 1 200 result 704