package leetcode;

public class ClimbingStairs {
    private static int [] dp = new int[46];
    public static int climStairs(int n) {
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= 45; i++)
            dp[i] = dp[i-2] + dp[i-1];
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(climStairs(4));
    }
}
