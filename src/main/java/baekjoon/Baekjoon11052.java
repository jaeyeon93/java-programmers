package baekjoon;

import java.util.*;

public class Baekjoon11052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int [] arr = new int[n+1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        System.out.println(solution(arr, n));
    }

    public static int solution(int [] arr, int n) {
        int [] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                dp[i] = Math.max(arr[j] + dp[i-j], dp[i]);
        }
        return dp[n];
    }
}