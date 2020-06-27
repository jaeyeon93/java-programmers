package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon1793 {
    private static BigInteger [] dp = new BigInteger[251];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dp[0] = BigInteger.ONE;
        dp[1] = BigInteger.ONE;
        dp[2] = BigInteger.valueOf(3);

        for (int i = 3; i <= 250; i++)
            dp[i] = dp[i-2].multiply(BigInteger.valueOf(2)).add(dp[i-1]);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}
