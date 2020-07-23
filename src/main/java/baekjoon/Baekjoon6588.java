package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon6588 {
    private static boolean [] primes = new boolean[1000001];
    private static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i*i < primes.length; i++)
            for (int j = i*i; j < primes.length; j += i)
                primes[j] = false;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            else
                solution(n);
        }
        bw.flush();
        bw.close();
    }

    private static void solution(int n) throws IOException {
        for (int i = 2; i <= n; i++)
            if (primes[i] && primes[n-i]) {
                bw.write(n + " = " + i + " + " + (n-i) + "\n");
                return;
            }
        bw.write("Goldbach's conjecture is wrong.\n");
    }

    // 이 솔루션으로 실행을 하면 시간초과난다.
    private static String solution2(int n) {
        int max = Integer.MIN_VALUE;
        StringBuilder sb = new StringBuilder();
        sb.append("Goldbach's conjecture is wrong.");

        for (int i = 2; i <= n; i++)
            if (primes[i] && primes[n-i]) {
                int diff = Math.abs(n-2*i);
                if (diff > max) {
                    sb = new StringBuilder();
                    sb.append(n).append(" = ").append(Math.min(i, n-i)).append(" + ").append(Math.max(i, n-i));
                }
            }
        return sb.toString();
    }
}
