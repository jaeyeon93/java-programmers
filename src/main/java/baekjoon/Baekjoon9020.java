package baekjoon;

import java.util.Scanner;

public class Baekjoon9020 {
    private static boolean [] primes = new boolean[10001];
    public static boolean check(int n) {
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 2; i <= 10000; i++)
            if (check(i)) primes[i] = true;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            System.out.println(solution(sc.nextInt()));
    }

    private static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int min = Integer.MAX_VALUE;
        for (int i = 2; i <= n; i++) {
            if (primes[i] && primes[n-i]) {
                int tmp = Math.abs(n-2*i);
                if (tmp < min) {
                    sb = new StringBuilder();
                    min = tmp;
                    sb.append(Math.min(i, (n-i))).append(" ").append(Math.max(i, (n-i)));
                }
            }
        }
        return sb.toString();
    }
}
